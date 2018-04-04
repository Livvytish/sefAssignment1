public class StaffAccounts
{

	private String username;
	private String password;

	private String[][] accounts = {{"Laeticia", "L123"},{"Olivia", "O123"}};
//	, {"Brandon", "B123"}};

	public StaffAccounts(String username, String password){
	    this.username = username;
	    this.password = password;
	}

	public boolean login(){
		if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1])))
	        return true;
	    else
	    	System.out.println("Wrong ID or Password, Please try again");
	        return false;
	}


}
