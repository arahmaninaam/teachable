import java.util.Scanner;
public class GeneralTravelForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputX = new Scanner(System.in);
		
		String x,
		Enter2Continue,
		FullName,
		CurrentYear,
		TravelDate,
		ContactNumber,
		Religion,
		Faith,
		EmailAddress,
		ContactAddress,
		JobTitle,
		MaritalStatus,
		NameOfMother,
		PassportNumber,
		ResidencyIssueDate,
		ResidencyExpiryDate,
		Enter2View;
		
		System.out.println("Welcome to the Application!! ");
		System.out.println("");
		System.out.println("");
		
		//Enter to Continue
	    System.out.println("Please press Enter to continue");
	    x = Enter2Continue = inputX.nextLine();
		
		System.out.println("Please kindly fill the information below :)");
		
    	//Full Name
		  System.out.print("Full Name: ");
	    x = FullName = inputX.nextLine();
	    System.out.println("");
	    //System.out.println("Full Name: " + FullName );
	    System.out.println("");
	    
	   
	      //Date of Birth
	      System.out.println(" Date of Birth");
        System.out.println("Day");
        System.out.println("Example: 04");
	      int  Day = inputX.nextInt();
        System.out.println("Month");
        System.out.println("Example: 08");
        int  Month = inputX.nextInt();
        System.out.println("Year");
        System.out.println("Example: 1992");
		    int Year = inputX.nextInt();
		    int Age = 2019 - Year;
	      System.out.println("");
	    
    	//Travel date
	    System.out.println("Travel date: ");
	    System.out.println("(Example dd/mm/yyy)");
	    x = TravelDate = inputX.nextLine();
	    System.out.println("");
	    System.out.println("");
	    
	    
	    //Contact number
	    System.out.println("Telephone number: ");
	    System.out.println("00966 500000000 / 00966 012 6000000");
	    x = ContactNumber = inputX.nextLine();
	    System.out.println("");
	    
	    //Religion
	    System.out.println("Religion: ");
	    x = Religion = inputX.nextLine();
	    System.out.println("");
	    
	    //Faith
	    System.out.println("Faith: ");
	    x = Faith = inputX.nextLine();
	    System.out.println("");
	    System.out.println("");
	    
	    //Email Address
	    System.out.println("Email Address: ");
	    x = EmailAddress = inputX.nextLine();
	    System.out.println("");
	    
	    //Contact Address
	    System.out.println("Contact Address: ");
	    x = ContactAddress = inputX.nextLine();
	    System.out.println("");
	    
	    //Job title
	    System.out.println("Job Title: ");
	    x = JobTitle = inputX.nextLine();
	    System.out.println("");
	    
	    //Marital Status 
	    System.out.println("Marital Status: ");
	    x = MaritalStatus = inputX.nextLine();
	    System.out.println("");
	    
	    //Name of Mother 
	    System.out.println("Name of Mother: ");
	    x = NameOfMother = inputX.nextLine();
	    System.out.println("");
	    
	    //Passport Number
	    System.out.println("Passport Number: ");
	    x = PassportNumber = inputX.nextLine();
	    System.out.println("");
	    
	    // Passport Expiry Date
	    System.out.println(" Passport Expiry Date");
        System.out.println("Day");
        System.out.println("Example: 04");
	      int  Day1 = inputX.nextInt();
        System.out.println("Month");
        System.out.println("Example: 08");
        int  Month1 = inputX.nextInt();
        System.out.println("Year");
        System.out.println("Example: 2040");
	    	int Year1 = inputX.nextInt();
		    int PassportExpiryDate0 = 2;

	    System.out.println("");
	    
	    //Residency Issue Date
	    System.out.println("Residency Issue Date: ");
	    System.out.println("(Example dd/mm/yyy)");
	    x = ResidencyIssueDate = inputX.nextLine();
	    System.out.println("");
	    
	    //Residency Expiry Date
	    System.out.println("Residency Expiry Date: ");
	    System.out.println("(Example dd/mm/yyy)");
	    x = ResidencyExpiryDate = inputX.nextLine();
	    System.out.println("");
	    
	    //Residency Expiry Date
	    System.out.println("Thank you!! All entered informations are now ready.");
	    System.out.println("Please press Enter to view");
	    x = Enter2View = inputX.nextLine();
	    
	    System.out.println("");
	    System.out.println("------------------------------------------------");
	    System.out.println("            Applicants Information              ");
	    System.out.println("------------------------------------------------");
	    System.out.println("");
	    
	    
	    //Final Results
	    System.out.println("Full name: " + FullName );
	    System.out.print("Date of Birth: (dd/mm/yyy)  " + Day + "/" + Month + "/" + Year + " - ");
	    System.out.println( + Age + " Years Old");
	    System.out.println("Travel date: " + TravelDate);
	    System.out.println("Telephone umber: " + ContactNumber);
	    System.out.println("Religion: " + Religion);
	    System.out.println("Faith: " + Faith);
	    System.out.println("Email Address: " + EmailAddress);
	    System.out.println("Contact Address: " + ContactAddress);
	    System.out.println("Job title: " + JobTitle);
	    System.out.println("Marital Status: " + MaritalStatus);
	    System.out.println("Name of Mother: " + NameOfMother);
	    System.out.println("Passport Number: " + PassportNumber);
	    System.out.print("Passport Expiry Date: (dd/mm/yyy)  " + Day1 + "/" + Month1 + "/" + Year1 + " - ");
	    System.out.println( "Approxmately after " + PassportExpiryDate0 + " Years");
	    System.out.println("Residency Issue Date: " + ResidencyIssueDate);
	    System.out.println("Residency Expiry Date: " + ResidencyExpiryDate);
	    
	    
	    
	    System.out.println("");
	    System.out.println("------------------------------------------------");
	    System.out.println("                     The End                    ");
	    System.out.println("------------------------------------------------");
	    System.out.println("");
	    
	    

	}

}