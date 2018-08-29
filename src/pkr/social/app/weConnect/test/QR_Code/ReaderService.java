package pkr.social.app.weConnect.test.QR_Code;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class ReaderService {

	public static void main(String[] args) throws IOException, URISyntaxException {

		File file = new File("F:\\we-conect-data-store\\wc-aadhar-store\\aadhaar.jpg");

		HttpClient httpClient = new DefaultHttpClient();
		HttpClient httpResultClient = new DefaultHttpClient();
		URI uri = new URI("http://localhost:8080/we-connect-service/api/v1.0/parseAadhar");
		HttpPost httpPost = new HttpPost(uri);
		FileEntity reqEntity = new FileEntity(file, ContentType.APPLICATION_OCTET_STREAM);
		httpPost.setEntity(reqEntity);
		HttpResponse httpResponse = httpClient.execute(httpPost);

		if (httpResponse.getStatusLine().getStatusCode() != 202) {
			System.out.println(httpResponse);
		}

	}
}
