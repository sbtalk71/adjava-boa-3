package com.demo.newfeatures;

public class TextBlockDemo {

	public static void main(String[] args) {
		String jsonPost="""
				{
				"userId": 1,
				"id": 1,
				"title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
				"body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
				}
				""";

		String name="Shantanu";
		int age=55;
		long pinCode=5000060;
		
		String details="""
				%s is aemployee of ABC and is %d yearls old and his pincode is %d
				""".formatted(name,age,pinCode);
		
		System.out.println(details);
	}

}
