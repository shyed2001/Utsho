package lecture4;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int menuSel;
		
		System.out.println("Menu");
		System.out.println("1. Enter data");
		System.out.println("2. Display data");
		System.out.println("3. Exit");
		System.out.println("Enter selection:");
		menuSel = in.nextInt();
		
		switch(menuSel){
			case 1: System.out.println("Menu istem 1");
					break;
			case 2: System.out.println("Menu item 2");
					break;
			case 3: System.out.println("Exiting....");
					break;
			default: System.out.println("Invalid selection!");			
		}	
		
		in.close();

	}

	

}
