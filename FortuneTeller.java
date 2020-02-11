import java.util.Scanner;
import java.util.Random; 

// entering white space leads to error

public class FortuneTeller {
	
	public static void main(String[] args) {
		
        Random rand = new Random(); 
		Scanner input = new Scanner(System.in);
		
		// Method to check for quit command
		class Check {
			String forQuit(String a) {
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
		String firstName = check.forQuit(input.nextLine().trim().toLowerCase());
		firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
		
		// Get last name
		System.out.println("Enter your last name");
		String lastName = check.forQuit(input.nextLine().trim().toLowerCase());
		lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
		
		// Get age
		System.out.println("Enter your age:");
		String userAge;
		userAge = check.forQuit(input.nextLine().trim().toLowerCase());
	        	
		// Get birth month (as integer)
		System.out.println("Enter your birth month as an integer:");
		String birthMonth;
		birthMonth = check.forQuit(input.nextLine().trim());
		
		// Get favorite ROYGBIV color, "help" displays ROYGBIV key	
		System.out.println("Enter your favorite ROYGBIV color:\nType \"Help\" to show ROYGBIV colors...");		
		String favColor = check.forQuit(input.nextLine().trim().toLowerCase());
		while(favColor.charAt(0) == 'h') {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
			favColor = check.forQuit(input.nextLine().trim().toLowerCase());
			}
				
		// Get number of siblings
		System.out.println("Enter how many siblings you have:");
		String numberSiblings;
		numberSiblings = check.forQuit(input.nextLine().trim());
			
		input.close();
	
	// Conditions to values
		
		// parity(userAge) -> retirementAge
		int retirementAge;
		int age = Integer.parseInt(userAge);
		if(age % 2 == 0) { 
			retirementAge = (65 - age);	
		} else {
			retirementAge = (70 - age);
		}
		
		// numberSiblings -> vacationHomeLocation
		String vacationHomeLocation;
		int siblings = Integer.parseInt(numberSiblings);		
		if(siblings == 0 ) {
			vacationHomeLocation = "Ulaanbaatar, Mongolia";
		} else if(siblings == 1) {
			vacationHomeLocation = "Singapore";
		} else if(siblings == 2 ) {
			vacationHomeLocation = "Willoughby Hills, Ohio";
		} else if(siblings == 3) {
			vacationHomeLocation = "Istanbul, Turkey";
		} else if(siblings >= 3) {
			vacationHomeLocation = "The Lost City of Atlantis";
		} else {
			vacationHomeLocation = "Titan";
		}
			
		// favColor -> mode of transportation 
		String modeOfTransport; 
		char charColor = favColor.charAt(0);
		switch (charColor) {
		case 'r':
			modeOfTransport = "taxi"; 
			break;
		case 'o':
			modeOfTransport = "city bus";
			break;
		case 'y':
			modeOfTransport = "motorcycle";
			break;
		case 'g':
			modeOfTransport = "VTOL vehicle";
			break;
		case 'b':
			modeOfTransport = "train";
			break;
		case 'i':
			modeOfTransport = "magic carpet";
			break;
		case 'v':
			modeOfTransport = "horse";
			break;
		default: modeOfTransport = "litter";
		}
		
		// birthMonth -> bankBalance
		double bankBalance;
		int month = Integer.parseInt(birthMonth);
		if(month >= 1 & month <= 4) {
			bankBalance = month * rand.nextInt(10000);
		} else if(month >= 5 & month <= 8 ) {
			bankBalance = month * rand.nextInt(100000);
		} else if(month >= 9 & month <= 12 ) {
			bankBalance = month * rand.nextInt(1000000);
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