package pkr.social.app.weConnect.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class _NewsApiTest {

	public static void main(String[] args) {
		String url = "https://newsapi.org/v2/top-headlines?country=us&apiKey=acf75e8a76cc4196aed24a579fe17ae6";
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println("=============================");
			//print result
			System.out.println(response.toString());
			System.out.println("=============================");
			
			//Handling Json Response
			JSONObject jsonObject = new JSONObject(response.toString());
			JSONArray articles = (JSONArray)jsonObject.get("articles");
			System.out.println(articles);
			ArrayList<NewsModel> list = new ArrayList<NewsModel>();
			
			for(int i=0; i<articles.length(); i++){
				NewsModel news=new NewsModel();
				news.setDescription(articles.getJSONObject(i).getString("description"));
				news.setAuthor(articles.getJSONObject(i).getString("author"));
				list.add(news);
		    }
			
			JSONArray jsArray = new JSONArray(list);
			System.out.println("=============================");
			for (NewsModel newsModel : list) {
			System.out.println(newsModel.getAuthor());	
			}
			System.out.println("=============================");
			System.out.println("=============================");
			System.out.println(jsArray);
			System.out.println("=============================");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
