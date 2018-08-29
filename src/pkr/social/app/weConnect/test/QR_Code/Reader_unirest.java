package pkr.social.app.weConnect.test.QR_Code;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Reader_unirest {
	public static void main(String[] args) throws UnirestException {
		HttpResponse<String> response = Unirest.post("http://localhost:8080/we-connect-service/api/v1.0/parseAadhar")
				.header("content-type", "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW")
				.header("Cache-Control", "no-cache").header("Postman-Token", "d4da5dbb-1cbe-4949-944e-28c630677801")
				.body("------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"AadhaarCard\"; filename=\"F:\\we-conect-data-store\\wc-aadhar-store\\aadhaar.jpg\"\r\nContent-Type: image/jpeg\r\n\r\n\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--")
				.asString();
		System.out.println(response);
	}

}
