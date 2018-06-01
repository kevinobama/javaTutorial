package kevinGates;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HttpURLConnectionExample {

	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {

		HttpURLConnectionExample http = new HttpURLConnectionExample();
		
		String url = "https://api.coinmarketcap.com/v2/ticker/1/";
		String data= http.httpGet(url);
		System.out.println(data);
	}

	private String httpGet(String apiUrl) throws Exception {		
		URL url = new URL(apiUrl);
		HttpURLConnection request = (HttpURLConnection) url.openConnection();

		request.setRequestMethod("GET");
	
		BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
		
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		return response.toString();
	}	
	
	// HTTP GET request
	private void sendGetOne() throws Exception {
		//https://api.coinmarketcap.com/v2/ticker/1/
		String url = "https://api.coinmarketcap.com/v2/ticker/1/";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());
	}

}
