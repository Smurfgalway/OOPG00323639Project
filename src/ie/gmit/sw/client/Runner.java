package ie.gmit.sw.client;

import ie.gmit.sw.client.config.*;

public class Runner {
	
	public static void main(String[] args) throws Throwable {
		Parasator par = new Parasator ();
		XMLParser xm = new XMLParser(par);
		xm.init();
		
		System.out.println(par);
	}

}
