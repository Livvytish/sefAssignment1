package a1;

import java.io.File;
import java.util.Scanner;

public class LoginTest
{

	public static void main(String[] args)
	{
		String filepath = "accounts.txt";
		Scanner scan = new Scanner(System.in);
		String username;
		String password;

		System.out.println("Log in:");
		System.out.println("Enter RMIT ID ");
		username = scan.nextLine();

		System.out.println("Enter Password: ");
		password = scan.nextLine();

		testLogin(username, password, filepath);

	}

	private static Scanner x;

	public static void testLogin(String username, String password, String filepath)
	{
		boolean found = false;
		String usernameInp = "";
		String passwordInp = "";

		try
		{
			x = new Scanner(new File(filepath));
			x.useDelimiter("[,\n]");

			while (x.hasNextLine() && !found)
			{
				usernameInp = x.next();
				passwordInp = x.next();

				if (usernameInp.trim().equals(username.trim()) && passwordInp.trim().equals(password.trim()))
				{
					found = true;
					System.out.println("User Logged In");
				}

			}
			x.close();
		}

		catch (Exception e)
		{
			System.out.println("Username or Password wrong, Try again");
		}
	}

}
