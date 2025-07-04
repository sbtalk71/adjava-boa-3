package com.demo.ser;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyDeserializer {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("mails.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			while (true) {
				Mail mail = (Mail) ois.readObject();
				System.out.println(mail.getMessage());
			}
		} catch (EOFException e) {
			System.out.println("all Objects retrived..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
