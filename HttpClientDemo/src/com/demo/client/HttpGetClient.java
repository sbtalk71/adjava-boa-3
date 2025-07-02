package com.demo.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpGetClient {

	public static void main(String[] args) throws Exception{
		HttpClient client=HttpClient.newHttpClient();
		
		HttpRequest request=HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts/2"))
				.header("Accept", "application/json")
				.GET()
				.build();
		HttpResponse<String> resp=client.send(request, BodyHandlers.ofString());
		
		System.out.println(resp.body());
		
		ObjectMapper mapper= new ObjectMapper();
		BlogPost post = mapper.readValue(resp.body(), BlogPost.class);
		
		System.out.println(post.getTitle());

	}

}
