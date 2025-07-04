package com.demo.iostreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		int b=0;
		try (FileInputStream fis = new FileInputStream("input.txt");
				BufferedInputStream bis= new BufferedInputStream(fis);
				FileOutputStream fos=new FileOutputStream("file_1.txt");
				BufferedOutputStream bos= new BufferedOutputStream(fos)) {
			while((b=bis.read())!=-1) {
				System.out.print(((char)b));
				bos.write(b);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
