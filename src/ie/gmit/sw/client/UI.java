package ie.gmit.sw.client;
import java.util.*;

public class UI {
	int selected;
	public UI() {
		super();
	}
	Scanner Scan = new Scanner(System.in);
	public void theMenu() { 
		
		System.out.println("1. Connect to Server \n 2. Print File Listing \n 3. Download File \n 4. Quit");
		System.out.println("\n Type Option []>");
		selected = Scan.nextInt();
		
		
	}
	public int getSelected() {
		return selected;
	}
	public void setSelected(int selected) {
		this.selected = selected;
	}
	
	
}
