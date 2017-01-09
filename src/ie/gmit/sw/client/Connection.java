package ie.gmit.sw.client;

import java.io.*;
import java.net.Socket; 
public class Connection { 

				public void run() { 
					try { 
						Socket s = new Socket("localhost", 7777); //the local host and server
						
						
						System.out.println("\n Server Connection has been achieved \n you are Connected to the server \n proceed with other options: \n");
						 // message that prints when the server is connected to 
					} catch (Exception e) { 
						System.out.println("Error has occured: " + e.getMessage()); //error handling
					}
				}
				
			
}//End of class
