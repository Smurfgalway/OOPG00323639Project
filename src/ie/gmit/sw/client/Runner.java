package ie.gmit.sw.client;

import ie.gmit.sw.client.config.*;
import ie.gmit.sw.server.MyServer;
import java.util.*;

public class Runner {
	
	public static void main(String[] args) throws Throwable {
	UI face = new UI();
	
	int i = 0;
	while (i <1){
		if (face.selected == 1){
			MyServer n = new  MyServer();
		}
	}
	
		Parasator par = new Parasator ();
		XMLParser xm = new XMLParser(par);
		xm.init();
		
		System.out.println(par);
	}

}
