package com.demo.jdbc;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;

public class RetrieveRootElementName {
   public static void main(String[] args) {
      try {      
         //Creating a DocumentBuilder Object
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
	     DocumentBuilder docBuilder = factory.newDocumentBuilder();
	    	  
         //Reading the XML
         StringBuilder xmlBuilder = new StringBuilder(); 
         xmlBuilder.append("<college></college>");
	    	  
         //Parsing the XML Document
         ByteArrayInputStream input = new ByteArrayInputStream(xmlBuilder.toString().getBytes("UTF-8"));
         Document xmldoc = docBuilder.parse(input);
	    	  
         //Retrieving the Root Element Name
         Element element = xmldoc.getDocumentElement();	    	  
         System.out.println("Root element name is "+element.getTagName());
	    	  
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}