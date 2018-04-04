package Module;

public class Login {
public static void main(String[] args)
	{
		// Scanner scan = new Scanner (new File("accounts.txt"));

		Scanner scan = new Scanner(System.in);

		String username;
		String password;

		System.out.println("Log in:");
		System.out.println("Enter RMIT ID ");
		username = scan.nextLine();

		System.out.println("Enter Password: ");
		password = scan.nextLine();

		StaffAccounts check = new StaffAccounts(username, password);

		
		if (check.login())
		System.out.println("You are logged in");

	}

}
