import java.util.Scanner;
import java.util.Random; 


public class FortuneTeller {
	
	public static void main(String[] args) {
		
        Random rand = new Random(); 
		Scanner input = new Scanner(System.in);
//		Check check = new Check();
//		Scanner asdf = new Scanner(System.in);
	//	boolean quit = false;
	/*
		while (true) {
			char a = input.nextLine().charAt(0);
			if(a == 'q') {
				System.out.println("Nobody likes a quitter...");
                System.exit(0);
			}
	*/	
		
		class Check {
			String q(String a) {
			if(a.charAt(0) == 'q') {
				System.out.println("Nobody likes a quitter...");
                System.exit(0);
				}			
			return a;
			}
		}	
	
		Check check = new Check();
		
			// Get first name
			System.out.println("Enter your first name:");
//			String firstName = input.nextLine().toLowerCase();

			String firstName;
			firstName = check.q(input.nextLine().trim().toLowerCase());
//		check.q(firstName);
	
			firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
			
			
	// boolean isEmptyString(String string) {
	//	return string == null || string.isEmpty();
	
			// Get last name
			System.out.println("Enter your last name");
			String lastName = input.nextLine().toLowerCase();
			lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
		
			// Get age
			System.out.println("Enter your age:");
			int userAge = input.nextInt();
		
			// Get birth month (as integer)
			System.out.println("Enter your birth month as an integer:");
			// this type of bug with input.nextInt() is a huge pet peeve of mine 
			int birthMonth = input.nextInt(); input.nextLine();
		
			// Get favorite ROYGBIV color, "help" displays ROYGBIV key	
			System.out.println("Enter your favorite ROYGBIV color:\nType \"Help\" to show ROYGBIV colors...");		
			String favColor = input.nextLine().trim().toLowerCase();
			while(favColor.charAt(0) == 'h') {
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
				favColor = input.nextLine().trim().toLowerCase();
			}
				
			// Get number of siblings
			System.out.println("Enter how many siblings you have:");
			int numberSiblings;
			numberSiblings = input.nextInt();
			
		
			input.close();	
//			asdf.close();
		
			// Conditions to values
		
			// parity(userAge) -> retirementAge
			int retirementAge;
			if(userAge % 2 == 0) { 
			retirementAge = (65 - userAge);	
			} else {
				retirementAge = (70 - userAge);
			}
		
			// numberSiblings -> vacationHomeLocation
			// note: I'm not using switch because of a duplicate case error
			String vacationHomeLocation;
			if(numberSiblings == 0 ) {
				vacationHomeLocation = "Ulaanbaatar, Mongolia";
			} else if(numberSiblings == 1) {
				vacationHomeLocation = "Singapore";
			} else if(numberSiblings == 2 ) {
				vacationHomeLocation = "Willoughby Hills, Ohio";
			} else if(numberSiblings == 3) {
				vacationHomeLocation = "Istanbul, Turkey";
			} else if(numberSiblings >= 3) {
				vacationHomeLocation = "The Lost City of Atlantis";
			} else {
				vacationHomeLocation = "Titan";
			}
		
			// favColor -> mode of transportation 
			String modeOfTransport; 
			char charColor = favColor.charAt(0);
			if(charColor == 'r') {
				modeOfTransport = "taxi";
			} else if(charColor == 'o') {
				modeOfTransport = "city bus";
			} else if(charColor == 'y') {
				modeOfTransport = "motorcycle";
			} else if(charColor == 'g') {
				modeOfTransport = "VTOL vehicle";
			} else if(charColor == 'b') {
				modeOfTransport = "train";
			} else if(charColor == 'i') {
				modeOfTransport = "magic carpet";
			} else {
				modeOfTransport = "horse";
			}
		
			// birthMonth -> bankBalance
			double bankBalance;
			if(birthMonth >= 1 & birthMonth <= 4) {
				bankBalance = birthMonth * rand.nextInt(10000);
			} else if(birthMonth >= 5 & birthMonth <= 8 ) {
				bankBalance = birthMonth * rand.nextInt(100000);
			} else if(birthMonth >= 9 & birthMonth <= 12 ) {
				bankBalance = birthMonth * rand.nextInt(1000000);
			} else {
				bankBalance = 0.00;	
			}
		
		
			// Display the user’s fortune in this format:
/* 
 	*[First Name]* 
 	*[Last Name]* 
 	will retire in *[# of years]* 
 	with *[bank balance]* in the bank,
	a vacation home in *[location]*, 
	and travel by *[mode of transporation]*.
*/
			System.out.println(firstName + " " + lastName + " will retire in " + retirementAge + " years " + "with $" + bankBalance + " in the bank, a vacation home in " + vacationHomeLocation + " and travel by " + modeOfTransport + ".");
		
//		}
	}
}		