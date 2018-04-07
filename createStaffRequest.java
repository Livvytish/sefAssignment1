
//import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class createStaffRequest
	{

		// to be confirmed: private String reqID;
		// to be confirmed: private Date reqCreateDate;
		// to be confirmed: private String reqOwner;
		private String reqCourseID;
		private String reqJobTitle;
		private String reqLocation;
		private String reqTime;
		private double reqDuration;
		private Date reqDate;
		private int reqStaffNumber;
		private String[] staffPreferences;
		private String reqComment;
		// tobeconfirmed: private String reqStatus;
		// tobeconfirmed: private double reqCost;

		public createStaffRequest(String reqCourseID, String reqJobTitle, String reqLocation, double reqDuration,
				Date reqDate, int reqStaffNumber, String reqComment)
			{
				this.reqCourseID = reqCourseID;
				this.reqJobTitle = reqJobTitle;
				this.reqLocation = reqLocation;
				this.reqDuration = reqDuration;
				this.reqDate = reqDate;
				this.reqStaffNumber = reqStaffNumber;
				this.reqComment = reqComment;
			}

		public createStaffRequest()
			{

				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);

				// System needs to allocate reqownerID and req timestamp to
				// request

				System.out.println("Create Staff Request");
				System.out.println("Enter Course: ");
				this.reqCourseID = scan.nextLine();

				// https://stackoverflow.com/questions/20681616/java-creating-a-menu-loop
				// set choiceentry to -1, this will make it to enter while loop
				int choiceentry = -1;

				while (choiceentry < 1 || choiceentry > 6)
					{

						System.out.println(
								"Enter Job Title\n 1: Lab Assistant\n 2: Lecture Assistant\n 3: Marking Assistant\n 4: Tutorial Substitute\n 5: Lecture Substitute\n 6: Other");
						if (scan.hasNextInt())
							choiceentry = scan.nextInt();

					}

				System.out.println("Course ID: " + reqCourseID);

				switch (choiceentry)
					{
					case 1:
						this.reqJobTitle = "labAssist";
						break;
					case 2:
						this.reqJobTitle = "lectAssist";
						break;
					case 3:
						this.reqJobTitle = "markAssist";
						break;
					case 4:
						this.reqJobTitle = "tutSub";
						break;
					case 5:
						this.reqJobTitle = "lecSub";
						break;
					case 6:
						this.reqJobTitle = "other";
						break;
					}

				// END stack overflow section

				System.out.println(reqJobTitle);

				// https://coderanch.com/t/598292/java/date-input-user-java

				// https://stackoverflow.com/questions/27580655/how-to-set-a-date-as-input-in-java

				String date = null;
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
				this.reqDate = null;

				do
					{
						System.out.println("Enter the Date Required (dd-MMM-yyyy): ");

						date = scan.next();

						try
							{
								// Parsing the String
								this.reqDate = dateFormat.parse(date);
							} catch (ParseException e)
							{
								System.out.println("Invalid Date Format");
								date = null;
							}

					} while (date == null);

				// end stack overflow section

				System.out.println(this.reqDate);

				System.out.println("Enter Location (BUILDING.LEVEL.ROOM:) ");
				this.reqLocation = scan.next();

				System.out.println(reqLocation);

				System.out.println("Enter start time:'00:00am/pm");
				this.reqTime = scan.next();
				
				System.out.println("How long do you need the staff for? (Enter in hours '0.00': ");
				this.reqDuration = scan.nextDouble();

				System.out.println("How many people do you need?: ");
				this.reqStaffNumber = scan.nextInt();
				

				staffPreferences = new String[this.reqStaffNumber];
				
				
				for(int i = 0; i<staffPreferences.length; i++){
					System.out.println("Enter Staff Preference No. " + (i+1) + "(if you do not have any preferences, type 'NA')");
					staffPreferences[i] = scan.next();
					
				}

				System.out.println("Enter Comments (optional):");
				this.reqComment = scan.next();

				//boogey requested final software tells request owner if staff is available at time requested or not.

			}

	}
