package ie.gmit.sw.client;

import java.io.*;
import java.net.Socket; 
public class Connection { 

				public void run() { 
					try { 
						Socket s = new Socket("localhost", 7777); 
						
						
						System.out.println("\n you are Connected to the server \n");
						
					} catch (Exception e) { 
						System.out.println("Error has occured: " + e.getMessage());
					}
				}
				
			
}//End of class
