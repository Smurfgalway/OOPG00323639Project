package ie.gmit.sw.client;

import ie.gmit.sw.client.config.*;
import ie.gmit.sw.server.MyServer;
import java.util.*;

public class Runner { // this class runs the menus from the UI along with what they carry out
	
	public static void main(String[] args) throws Throwable {
	UI face = new UI();
	MyServer server = new  MyServer();
	FileFinder file = new FileFinder(); 
	
	int i = 0;
	while (i < 1){
		face.theMenu();
		if (face.selected == 1){ // connects the server
			Connection connect = new Connection();
			connect.run();
		}
		if (face.selected ==2){ // display files
			file.find();
		}
		if (face.selected ==3){
			System.out.println("404 Download function not found"); //I did not get function working
		}
		if (face.selected ==4){
			System.out.println("Quitting the project"); // quits the project
			i = 2;
		}
	}
	
		Parasator par = new Parasator ();
		XMLParser xm = new XMLParser(par); // parses the xml document
		xm.init();
		
		System.out.println(par); // prints out the contents of the xml document
	}

}
