// Airline.java - This program determines if an airline passenger is 
// eligible for a 25% discount. 

import java.util.Scanner;

public class Airline 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		String passengerName = ""; 	// Passenger's name.
		
		int passengerAge = 0; 	// Passenger's age.

		
		System.out.println("Enter passenger's name: ");
		passengerName  = s.nextLine();
		System.out.println("Enter passenger's age: ");
		passengerAge  = s.nextInt();
		
		
		// Test to see if this customer is eligible for a 25% discount. 
				
		if(passengerAge <=6 || passengerAge >= 65)
		{
		   System.out.println("Passenger name: " + passengerName);  		   
		   System.out.println("Passenger age : " + passengerAge);
		   System.out.println("This passenger is eligible for a 25% discount.");
		}
		else
		{
		   System.out.println("Passenger name: " + passengerName);  		   
		   System.out.println("Passenger age : " + passengerAge);
		   System.out.println("This passenger is not eligible for a 25% discount.");
		}

		// This is the work done in the endOfJob() method
		System.exit(0);
	}

} 

