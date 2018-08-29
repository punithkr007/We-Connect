package pkr.social.app.weConnect.Model.ServiceImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import pkr.social.app.weConnect.Entitlies.wc_UserEntity;

@Service
public class QR_CodeReaderService {

	public wc_UserEntity getAadhaarDetails(MultipartFile _aadhaarCard) throws Exception {

		wc_UserEntity wc_UserEntity=null;
		File _aadhaarFile = new File(_aadhaarCard.getOriginalFilename());
		_aadhaarCard.transferTo(_aadhaarFile);

		MultiValueMap<String, Object> bodyMap = new LinkedMultiValueMap<>();
		Resource resource = new FileSystemResource(_aadhaarFile);

		bodyMap.add("AadhaarCard", resource);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		List<MediaType> list = new ArrayList<MediaType>();
		list.add(MediaType.ALL);

		headers.setAccept(list);
		HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(bodyMap, headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange(
				"http://localhost:8080/we-connect-service/api/v1.0/parseAadhar", HttpMethod.POST, requestEntity,
				String.class);
		if (response.getStatusCode() == HttpStatus.OK) {
			ObjectMapper mapper = new ObjectMapper();
			wc_UserEntity = mapper.readValue(response.getBody(), wc_UserEntity.class);

		}
		return wc_UserEntity;
	}

}
