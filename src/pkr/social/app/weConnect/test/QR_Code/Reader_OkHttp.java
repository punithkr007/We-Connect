package pkr.social.app.weConnect.test.QR_Code;

import java.io.IOException;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class Reader_OkHttp {
	public static void main(String[] args) throws IOException {
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW");
		RequestBody body = RequestBody.create(mediaType,
				"------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"AadhaarCard\"; filename=\"F:\\we-conect-data-store\\wc-aadhar-store\\aadhaar.jpg\"\r\nContent-Type: image/jpeg\r\n\r\n\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--");
		Request request = new Request.Builder().url("http://localhost:8080/we-connect-service/api/v1.0/parseAadhar")
				.post(body)
				.addHeader("content-type", "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW")
				.addHeader("Cache-Control", "no-cache")
				.addHeader("Postman-Token", "93d351a7-609d-4f8e-bc1c-3688e4cbf98c").build();

		Response response = client.newCall(request).execute();
		System.out.println(response);
	}
}
