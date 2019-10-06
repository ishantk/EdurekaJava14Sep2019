package co.edureka.controller;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// Here we override built-in methods from DefaultHandler and these methods will be executed automatically for us
public class MyHandler extends DefaultHandler{ // Simple API for XML

	// When XML Document Parsing Starts
	public void startDocument() throws SAXException {
		System.out.println(">> XML Parsing Started");
	}
	

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.print("<"+qName+">");
	}
	
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch, start, length);
		System.out.print(data);
		
		// Logic Goes Here to Create Customer Objects and put them in XML files
	}
	
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		//System.out.println("</"+qName+">");
	}
	
	// When XML Document Parsing Finishes
	public void endDocument() throws SAXException {
		System.out.println(">> XML Parsing Finished");
	}
	
}
