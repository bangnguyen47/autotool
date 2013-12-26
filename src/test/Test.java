package test;

import lib.HTTPConnection;

public class Test {

	public static void main(String[] args) throws Exception {
		String url = "http://google.com";

		System.getProperties().put("proxySet", "true");
		System.getProperties().put("proxyHost", "192.168.0.1");
		System.getProperties().put("proxyPort", "8080");
		
		HTTPConnection http = new HTTPConnection();
		String s = http.getPageContent(url);
		System.out.println(s);
	}

}
