package com.demo.iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) {

		int b=0;
		try (FileReader fis = new FileReader("input.txt");
				BufferedReader bis= new BufferedReader(fis);
				FileWriter fos=new FileWriter("file_2.txt");
				BufferedWriter bos= new BufferedWriter(fos)) {
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
