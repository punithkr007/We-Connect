package pkr.social.app.weConnect.test.QR_Code;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import pkr.social.app.weConnect.Entitlies.wc_UserEntity;

public class Reader_RestTemplate {
	public static void main(String[] args) throws JSONException, JsonParseException, JsonMappingException, IOException {

		MultiValueMap<String, Object> bodyMap = new LinkedMultiValueMap<>();
		File file = new File("F:\\we-conect-data-store\\wc-aadhar-store\\aadhaar.jpg");
		Resource resource = new FileSystemResource(file);

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
			wc_UserEntity aadharEntity = mapper.readValue(response.getBody(), wc_UserEntity.class);
			System.out.println(aadharEntity);
		} else {
			System.err.println("FAILED");
		}

	}
}
