package ie.gmit.sw.client;

import java.io.*;
import java.net.Socket; 
public class WebClient { 
	
	public static void main(String[] args) throws Throwable{
		final String request = "GET /characters.txt HTTP/1.1\n\n"; 
		
		for (int i = 0; i < 10; i++){
			
		
			new Thread(new Runnable(){
				
				public void run() { 
					try { 
						Socket s = new Socket("localhost", 7777); 
						
						//Serialise / marshal a request to the server
						ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
						out.writeObject(request); 
						out.flush(); 
						
						Thread.yield(); 
						
						ObjectInputStream in = new ObjectInputStream(s.getInputStream());
						String response = (String) in.readObject(); 
						
						String threadName = Thread.currentThread().getName(); 
 	 					System.out.println(response + "-->" + threadName + " gone to sleep...");
						
 	 					
 	 					Thread.sleep(10000);
						
						System.out.println(threadName + " it has awoken... ");
						
						s.close(); 
						
					} catch (Exception e) { 
						System.out.println("Error has occured: " + e.getMessage());
					}
				}
				
			}, "Client-" + i).start(); 
		}//End of for loop
		
		System.out.println("Main has returned now");
		
	}//End of main method
}//End of class
