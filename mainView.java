package View;

import java.util.Scanner;
import Application.HR_Application;

public class mainView {
	HR_Application x_app;
	
	public mainView()
	{
		x_app=new HR_Application();
		
		Scanner scan=new Scanner(System.in);
		String username="";
		String password="";
		
		do
		{
			System.out.print("Please enter your username:");
			username=scan.nextLine();
			System.out.print("Please enter your passord:");
			password=scan.nextLine();
			
			if(!x_app.login(username,password))
				System.out.println("Invalid username/passworde");
			
		} while(!x_app.login(username,password));
		
		x_app.runningSystem();
		scan.close();
	}

	public void showRequestMenu()
	{
		System.out.println("1: View all requests ");
		System.out.println("2: Creat a request ");
		System.out.println("3: Edit a request ");
		System.out.println("5: Submit a request ");
		System.out.println("6: Permit a request ");
		System.out.println("7: Deny a request ");
		System.out.println("8: Back to previous menu ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainView mv=new mainView();
		
	}

}
