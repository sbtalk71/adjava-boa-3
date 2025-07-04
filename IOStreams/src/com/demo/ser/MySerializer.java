package com.demo.ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializer {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("mails.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);

		) {

			Mail mail= new Mail("me@nowhere.com","you@everywhere.com","Hello There");
			oos.writeObject(mail);
			Mail mail1= new Mail("me@nowhere.com","you@everywhere.com","Hi There");
			oos.writeObject(mail1);
			Mail mail2= new Mail("me@nowhere.com","you@everywhere.com","How do you do");
			oos.writeObject(mail2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
