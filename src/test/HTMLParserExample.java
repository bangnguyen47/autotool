package test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 
public class HTMLParserExample {
 
  public static void main(String[] args) {
 
	Document doc;
	try {
 
		System.getProperties().put("proxySet", "true");
		System.getProperties().put("proxyHost", "192.168.0.1");
		System.getProperties().put("proxyPort", "8080");
		
		// need http protocol
		doc = Jsoup.connect("http://google.com").get();
 
		// get page title
		String title = doc.title();
		System.out.println("title : " + title);
 
		// get all links
		Elements links = doc.select("a[href]");
		for (Element link : links) {
 
			// get the value from href attribute
			System.out.println("\nlink : " + link.attr("href"));
			System.out.println("text : " + link.text());
 
		}
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
  }
 
}