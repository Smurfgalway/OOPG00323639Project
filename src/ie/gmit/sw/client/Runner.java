package ie.gmit.sw.client;

import ie.gmit.sw.client.config.*;
import ie.gmit.sw.server.MyServer;
import java.util.*;

public class Runner {
	
	public static void main(String[] args) throws Throwable {
	UI face = new UI();
	MyServer server = new  MyServer();
	
	int i = 0;
	while (i < 1){
		face.theMenu();
		if (face.selected == 1){
			Connection connect = new Connection();
			connect.run();
		}
		if (face.selected ==2){
			
		}
		if (face.selected ==3){
			
		}
		if (face.selected ==4){
			System.out.println("Quitting the project");
			i = 2;
		}
	}
	
		Parasator par = new Parasator ();
		XMLParser xm = new XMLParser(par);
		xm.init();
		
		System.out.println(par);
	}

}
