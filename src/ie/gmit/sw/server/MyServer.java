package ie.gmit.sw.server;


import java.io.*; 
import java.net.*; 

public class MyServer {
	
	private ServerSocket srs; 
	private static final int ThePort = 7777;  
	private volatile boolean keepRunning = true;
	
	
	
	private MyServer(){
		try { 
			
			srs = new ServerSocket(ThePort); 
			
			
			Thread server = new Thread(new Listener(), "Web Server Listener");
			server.setPriority(Thread.MAX_PRIORITY); 
			server.start();
			
			System.out.println("Server started and listening on port " + ThePort);
			
		} catch (IOException e) { 
			System.out.println("Yikes! Something bad happened..." + e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		new MyServer(); 
	}
	
	

	private class Listener implements Runnable{ 
		
		public void run() {
			int counter = 0; 
			while (keepRunning){ 
				try { 
					
					Socket s = srs.accept(); 
					
					
					
					new Thread(new HTTPRequest(s), "T-" + counter).start(); 
					counter++; 
				} catch (IOException e) {
					System.out.println("Error handling incoming request..." + e.getMessage());
				}
			}
		}
	}
	
	
	
	private class HTTPRequest implements Runnable{
		private Socket sock; 
		
		private HTTPRequest(Socket request) { 
			this.sock = request; 
		}

		
        public void run() {
            try{ 
            	
            	
            	ObjectInputStream in = new ObjectInputStream(sock.getInputStream());
                Object command = in.readObject();
                System.out.println(command);
                
                
                String message = "<h1>Happy Days</h1>";
            	ObjectOutputStream out = new ObjectOutputStream(sock.getOutputStream());
                out.writeObject(message);
                out.flush();
                out.close(); 
                
            } catch (Exception e) {
            	System.out.println("Error processing request from " + sock.getRemoteSocketAddress());
            	e.printStackTrace();
            }
        }
	}
}