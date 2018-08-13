package pkr.social.app.weConnect.Model.ServiceImpl;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {

	public void _uploadFileService(MultipartFile _file) throws IllegalStateException, IOException {
		String _uploadDirectory = "F:\\we-conect-data-store\\wc-aadhar-store";
		File _directory = new File(_uploadDirectory);
		if (!_directory.exists()) {
			_directory.mkdir();
		}
		if (!_file.getOriginalFilename().equals("")) {
			String saveDirectory = _uploadDirectory + File.separator;
			_file.transferTo(new File(saveDirectory + _file.getOriginalFilename()));
		}
	}

}
