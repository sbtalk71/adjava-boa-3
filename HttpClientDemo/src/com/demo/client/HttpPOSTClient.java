package com.demo.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpPOSTClient {

	public static void main(String[] args) throws Exception{
		
		String data="""
					{
					  "userId": 10,
					  "id": 120,
					  "title": "Raining today",
					  "body": "intermittent rain observed.."
					}
					""";
		
		HttpClient client=HttpClient.newHttpClient();
		
		HttpRequest request=HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
				.header("Content-Type", "application/json")
				.POST(BodyPublishers.ofString(data))
				.build();
		
		HttpResponse<String> resp=client.send(request, BodyHandlers.ofString());
		
		System.out.println(resp.statusCode());

	}

}
