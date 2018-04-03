package View;

import java.util.Scanner;
import Application.HR_Application;

public class mainView {
	HR_Application x_app;
	Scanner x_scan;
	
	public mainView()
	{
		x_app=new HR_Application();
		x_scan=new Scanner(System.in);
		
		String username="";
		String password="";
		
		do
		{
			System.out.print("Please enter your username:");
			username=x_scan.nextLine();
			System.out.print("Please enter your passord:");
			password=x_scan.nextLine();
			
			if(!x_app.login(username,password))
				System.out.println("Invalid username/passworde");
			
		} while(!x_app.login(username,password));
		
		boolean exit=false;
		do
		{
			System.out.println("1: Request Operation");
			System.out.println("5: Exit");
			int option=readOption();
			
			switch(option)
			{
			case 1:
				while(showRequestMenu());
				break;
			case 5:
				exit=true;
				break;
			default:
				System.out.println("Invalid Option");
			}
			
		}while(!exit);
		
		x_scan.close();
	}

	boolean showRequestMenu()
	{
		System.out.println("1: View all requests ");
		System.out.println("2: Creat a request ");
		System.out.println("3: Edit a request ");
		System.out.println("4: Submit a request ");
		System.out.println("5: Permit a request ");
		System.out.println("6: Deny a request ");
		System.out.println("7: Back to previous menu ");
		
		int option=readOption();
		int reqIndex=0;
		
		switch(option)
		{
		case 1:
			x_app.viewRequests();
			break;
		case 2:
			x_app.createRequest();
			break;
		case 3:
			x_app.viewRequests();
			reqIndex=readOption();
			x_app.editRequest(reqIndex);
			break;
		case 4:
			x_app.viewRequests();
			reqIndex=readOption();
			x_app.submitRequest(reqIndex);
			break;
		case 5:
			x_app.viewRequests();
			reqIndex=readOption();
			x_app.permitRequest(reqIndex);
			break;
		case 6:
			x_app.viewRequests();
			reqIndex=readOption();
			x_app.denyRequest(reqIndex);
			break;
		case 7:
			return false;
		default:
			System.out.println("Invalid Option");
		}
		
		return true;
	}
	
	boolean showCourseMenu()
	{
		
		return true;
	}
	
	int readOption()
	{
		int command=0;
		
		try
		{
			command=x_scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
			x_scan.next();
		}
		
		return command;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainView mv=new mainView();
		
	}

}
