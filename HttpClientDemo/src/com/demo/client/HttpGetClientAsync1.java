package com.demo.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpGetClientAsync1 {

	public static void main(String[] args) throws Exception{
		HttpClient client=HttpClient.newHttpClient();
		
		HttpRequest request=HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts/2"))
				.header("Accept", "application/json")
				.GET()
				.build();
		client.sendAsync(request, BodyHandlers.ofString())
		.thenApply(HttpResponse::body)
		.thenAccept(System.out::println).join();
		
		

	}

}
