// Author of class: Brandon Hurst s3662215
// Class: Function to read in casual staff's availability

import java.io.*;
import java.util.Scanner;
public class availability {

	Scanner bc = new Scanner(System.in);
	
	public static void main(String[] args) {
		availability s = new availability();
		s.run();
	}
	
	public void run() {
		
		boolean running = true;
		while (running) {
			switch (displayMenu()){
			case "a":
			case "A":
				enterAvailability();
				break;
			case "b":
			case "B":
				// otherFunction();
				break;
			case "c":
			case "C":
				// otherFunction();
				break;
			case "d":
			case "D":
				// otherFunction();
				break;
			case "x":
			case "X":
				// Will make a function to save data
				// saveData();
				running = false;
				break;
			default:
			System.out.println("That was an invalid input, please re-enter your selection: ");
			break;
			}
		}
	}

	// Method to display the menu
	public String displayMenu() {
		System.out.println(String.format("\n%-25s %s", "Enter Availability", "A"));
		System.out.println(String.format("%-25s %s", "______", "B"));
		System.out.println(String.format("%-25s %s", "______", "C"));
		System.out.println(String.format("%-25s %s", "______", "D"));
		System.out.println(String.format("%-25s %s", "Logout", "X"));
		System.out.print(String.format("%-25s", "Enter selection: "));
		// User Enters "A", which then loads the function implemented for Milestone 1
		return bc.next();
	}
	
		
		
	public void enterAvailability(){	
		// path & filename
		String filename = "schedule.txt"; 
		PrintWriter outputStream = null;
		// Variables needed for function
		String day;
		// String timeOption;
		int startTime = 0;
		int endTime = 0;
		
		// Need to create a loop so the casual staff can put in another day and time they're available 
		
		//---Day---//
		System.out.println("Day			Code");
		System.out.println("Monday 		= 	Mon");
		System.out.println("Tuesday 	= 	Tue");
		System.out.println("Wednesday 	= 	Wed");
		System.out.println("Thursday 	= 	Thu");
		System.out.println("Friday  	= 	Fri");
		System.out.println("Saturday 	= 	Sat");
		System.out.println("Sunday 		= 	Sun");
		System.out.println("");
		
		// Reading in the day they're available
		System.out.print(String.format("%-20s", "Please enter the code for the day you are available to work:  "));
		bc.nextLine();
		day = bc.nextLine();
		
		// Need to create a check to see if day user inputed is valid 
		System.out.println("You have selected " + day);
		
		System.out.println("");
		
		//---Time---//
		String option = "";
		// When option does not equal N, jump out of loop
		while(!option.equals("N"))
		{
			System.out.println("Available times");
			System.out.println("Time		Code");
			System.out.println("6:00am	=	6");
			System.out.println("7:00am	=	7");
			System.out.println("8:00am	=	8");
			System.out.println("9:00am	=	9");
			System.out.println("10:00am	=	10");
			System.out.println("11:00am	=	11");
			System.out.println("12:00pm	=	12");
			System.out.println("1:00pm	=	13");
			System.out.println("2:00pm	=	14");
			System.out.println("3:00pm	=	15");
			System.out.println("4:00pm	=	16");
			System.out.println("5:00pm	=	17");
			System.out.println("6:00pm	=	18");
			// Reading in the time they're available
			System.out.println("Please enter the hour you can start: ");
			startTime = bc.nextInt(); 
			System.out.print("Please enter the hour you must be finished by: end time: ");
			endTime = bc.nextInt();
			
			// Staff may be able to work another time during the same day, so option is available for them
			System.out.println("Would you like to enter another time?");
			System.out.print("(Type Y for Yes, Type N for NO) ");
			bc.nextLine();
			option = bc.nextLine();
			System.out.println(option);
		}
	
		System.out.println("Availability on " + day + ": " + startTime + ":00 - " + endTime + ":00");
		
		try {
		 // create a new object of the printWriter class & assign to the Object variable
		 outputStream = new PrintWriter(new FileOutputStream(filename));
		 
		 outputStream.write(day + '\t' + startTime + ":00" + '\t' + endTime + ":00" + '\n');
		 System.out.println("Availability Saved");
		
		} catch (FileNotFoundException e) {
		 // display the inbuilt error message belonging to e object
		 System.out.println(e);
		} // end try catch
		outputStream.close();
	}

}