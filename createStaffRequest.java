
//import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class createStaffRequest
	{

		public static void main(String[] args)
			{

				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);

				// System needs to allocate reqownerID and req timestamp to
				// request

				System.out.println("Create Staff Request");
				System.out.println("Enter Course: ");
				String reqCourseID = scan.nextLine();

				String reqJobTitle = "";

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
						reqJobTitle = "labAssist";
						break;
					case 2:
						reqJobTitle = "lectAssist";
						break;
					case 3:
						reqJobTitle = "markAssist";
						break;
					case 4:
						reqJobTitle = "tutSub";
						break;
					case 5:
						reqJobTitle = "lecSub";
						break;
					case 6:
						reqJobTitle = "other";
						break;
					}

				// END stack overflow section

				System.out.println(reqJobTitle);


				// https://coderanch.com/t/598292/java/date-input-user-java

				// https://stackoverflow.com/questions/27580655/how-to-set-a-date-as-input-in-java

				String date = null;
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
				Date reqDate = null;

				do
					{
						System.out.println("Enter the Date Required (dd-MMM-yyyy): ");

						date = scan.next();

						try
							{
								// Parsing the String
								reqDate = dateFormat.parse(date);
							} catch (ParseException e)
							{
								System.out.println("Invalid Date Format");
								date = null;
							}

					} while (date == null);

				System.out.println(reqDate);
				
				System.out.println("Enter Location (BUILDING.LEVEL.ROOM:) ");
				String reqLocation = scan.next();

				System.out.println(reqLocation);

				// Need to work out time variable.
				
				System.out.println("How many people do you need?: ");
				int reqStaffNumber = scan.nextInt();
				
				//Create array of staff preferences base on size of reqStaffNumber. Enter names from there using iteration through for loop.
				
				System.out.println("Enter Comments (optional):");
				String reqComments = scan.next();
				
				
				
				
				
				
				// The system validates if preferred candidates are available
				// for job. **DONT KNOW IF THIS WILL BE ACHIEVABLE FOR SATURDAY
				// The actor inputs comments.
				// From here, the “Submit Request” use case takes over.

			}

	}
