package ie.gmit.sw.client;

import java.io.File;

public class FileFinder {
	
	public void find() {
		
		File directory = new File("src/files"); // points to the folder in the project directory
		File[] files = directory.listFiles();
		
	for (int i = 0; i < files.length; i++) {
			      
		    	if (files[i].isFile()) // if item is a file, do this
		    		System.out.println("File Name	\n" + files[i].getName());

	}
}
}
