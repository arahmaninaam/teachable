import java.util.Scanner;
public class GeneralTravelForm {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String 
		x,
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
		PassportNumber;
		
		
		Integer
		BirthDay,
		BirthMonth,
		BirthYear,
		Age,
		TravelDay,
		TravelMonth,
		TravelYear,
		PassportIssueDay,
	    PassportIssueMonth,
	    PassportIssueYear,
	    PassportIssueDateNumberOfYears,
		PassportExpiryDay,
		PassportExpiryMonth,
		PassportExpiryYear,
		PassportExpiryDateNumberOfYears,
		ResidencyIssueDay,
		ResidencyIssueMonth,
		ResidencyIssueYear,
		ResidencyIssueDate,
		ResidencyExpiryDay,
		ResidencyExpiryMonth,
		ResidencyExpiryYear,
		AfterPeriod,
		EnterToView;
		
		
		System.out.println("Welcome to the Application!! ");
		System.out.println("");
		System.out.println("");
		
		//Enter to Continue
	    System.out.println("Please press Enter to continue");
	    Enter2Continue = x = input.nextLine();
	    
		
		System.out.println("Please kindly fill the information below :)");
		
	   //Full Name
		System.out.print("Full Name: ");
	    FullName = x = input.nextLine();
	    System.out.println("");
	    
	  //Contact number
	    System.out.println("Telephone number: ");
	    System.out.println("00966500000000 / 009660126000000");
	    ContactNumber = x = input.nextLine();
	    System.out.println("");
	    
	  //Email Address
	    System.out.println("Email Address: ");
	    x = EmailAddress = input.nextLine();
	    System.out.println("");
	    
	  //Contact Address
	    System.out.println("Contact Address: ");
	    x = ContactAddress = input.nextLine();
	    System.out.println("");
	    
	  //Passport Number
	    System.out.println("Passport Number: ");
	    x = PassportNumber = input.nextLine();
	    System.out.println("");
	    
	  //Religion
	    System.out.println("Religion: ");
	    x = Religion = input.nextLine();
	    System.out.println("");
	    
	  //Faith
	    System.out.println("Faith: ");
	    x = Faith = input.nextLine();
	    System.out.println("");
	    System.out.println("");
	    
	    
	  //Job title
	    System.out.println("Job Title: ");
	    x = JobTitle = input.nextLine();
	    System.out.println("");
	    
	  //Marital Status 
	    System.out.println("Marital Status: ");
	    x = MaritalStatus = input.nextLine();
	    System.out.println("");
	    
	  //Name of Mother 
	    System.out.println("Name of Mother: ");
	    x = NameOfMother = input.nextLine();
	    System.out.println("");
	   
	  //Date of Birth
	    System.out.println(" Date of Birth");
        System.out.println("Day");
        System.out.println("Example: 04");
	    BirthDay = input.nextInt();
        System.out.println("Month");
        System.out.println("Example: 08");
        BirthMonth = input.nextInt();
        System.out.println("Year");
        System.out.println("Example: 1992");
		BirthYear = input.nextInt();
		Age = 2019 - BirthYear;
	    System.out.println("");
	    
	  //Travel date
	    System.out.println("Travel date");
	    System.out.println("Day");
        System.out.println("Example: 04");
        TravelDay = input.nextInt();
        System.out.println("Month");
        System.out.println("Example: 08");
        TravelMonth = input.nextInt();
        System.out.println("Year");
        System.out.println("Example: 2019");
		TravelYear = input.nextInt();
	    System.out.println("");
	    
	  //Passport Issue Date
	    System.out.println(" Passport Issue Date");
        System.out.println("Day");
        System.out.println("Example: 04");
	    PassportIssueDay = input.nextInt();
        System.out.println("Month");
        System.out.println("Example: 08");
        PassportIssueMonth = input.nextInt();
        System.out.println("Year");
        System.out.println("Example: 2030");
        PassportIssueYear = input.nextInt();
	    PassportIssueDateNumberOfYears = PassportIssueYear - 2019;
	    
	    
	    System.out.println("");
	    
	   
	  //Passport Expiry Date
	    System.out.println(" Passport Expiry Date");
        System.out.println("Day");
        System.out.println("Example: 04");
	    PassportExpiryDay = input.nextInt();
        System.out.println("Month");
        System.out.println("Example: 08");
        PassportExpiryMonth = input.nextInt();
        System.out.println("Year");
        System.out.println("Example: 2030");
        PassportExpiryYear = input.nextInt();
	    PassportExpiryDateNumberOfYears = PassportExpiryYear - 2019;

	    System.out.println("");
	    
	  //Residency Issue Date
	    System.out.println("Residency Issue Date: ");
	    System.out.println("Day");
	    System.out.println("Example: 04");
	    ResidencyIssueDay = input.nextInt();
	    System.out.println("Month");
	    System.out.println("Example: 08");
	    ResidencyIssueMonth = input.nextInt();
	    System.out.println("Year");
        System.out.println("Example: 2014");
        ResidencyIssueYear = input.nextInt();
        ResidencyIssueDate =  ResidencyIssueYear - 2019;
	    System.out.println("");
	    
	    //More work need to be done for Residency Issue Date.
	    
	  //Residency Expiry Date
	    System.out.println("Residency Expiry Date: ");
	    System.out.println("Day");
	    System.out.println("Example: 04");
	    ResidencyExpiryDay = input.nextInt();
	    System.out.println("Month");
	    System.out.println("Example: 08");
	    ResidencyExpiryMonth = input.nextInt();
	    System.out.println("Year");
        System.out.println("Example: 2020");
        ResidencyExpiryYear = input.nextInt();
        AfterPeriod = ResidencyExpiryYear - 2019;
	    System.out.println("");
	    
	    
	  //Enter to View
	    System.out.println("Thank you!! All entered informations are now ready.");
	    System.out.println("Please 0 to continue");
	    EnterToView = input.nextInt();
	    
	    System.out.println("");
	    System.out.println("------------------------------------------------");
	    System.out.println("            Applicants Information              ");
	    System.out.println("------------------------------------------------");
	    System.out.println("");
	  
	    
	    //Final Results
	    System.out.println("Full name: " + FullName );
	    //Date of Birth Result
	    if (BirthYear <= 2019)
		    System.out.println("Date of Birth (dd/mm/yyyy): " + BirthDay + "/" + BirthMonth + "/" + BirthYear + " - Approxmately " + Age + " Year Old");
		    else System.out.println(BirthDay + "/" + BirthMonth + "/" + BirthYear +" - Error!! Year entered is invalid. The Birth year should not exceed the current year. Your application can be rejected for this error.");
	    //Travel Date Result
	    if (TravelYear >= 2019)
	    	System.out.println("Travel Date (dd/mm/yyyy):  " + TravelDay + "/" + TravelMonth + "/" + TravelYear + " - ");
	    	else System.out.println(TravelDay + "/" + TravelMonth + "/" + TravelYear +" - Error!! Year entered is invalid. The travel year should be current year or next year maximum. Your application can be rejected for this error.");
	    //Telephone Number Result
	    System.out.println("Telephone umber: " + ContactNumber);
	    //Religion Result
	    System.out.println("Religion: " + Religion);
	    //Faith Result
	    System.out.println("Faith: " + Faith);
	    //Email Address Result
	    System.out.println("Email Address: " + EmailAddress);
	    //Contact Address Result
	    System.out.println("Contact Address: " + ContactAddress);
	    //Job Title Result
	    System.out.println("Job title: " + JobTitle);
	    //Marital Status Result
	    System.out.println("Marital Status: " + MaritalStatus);
	    //Name Of Mother Result
	    System.out.println("Name of Mother: " + NameOfMother);
	    //Passport Number Result
	    System.out.println("Passport Number: " + PassportNumber);
	    //Passport Issue Date Result
	    if (PassportIssueYear >= 2009)
		    System.out.println("Passport Issue Date: (dd/mm/yyyy)  " + PassportIssueDay + "/" + PassportIssueMonth + "/" + PassportIssueYear + " - ");
		    else System.out.println( "Approxmately after " +  PassportIssueDateNumberOfYears + " Year(s) - Error!! The Passport Issue Date can not be less tah 5 to 10 years. "); 
	    //Passport Expiry Date Result
	    if (PassportExpiryYear <= 2028)
		    System.out.println("Passport Expiry Date: (dd/mm/yyyy)  " + PassportExpiryDay + "/" + PassportExpiryMonth + "/" + PassportExpiryYear + " - ");
		    else System.out.println( "Approxmately after " +  PassportExpiryDateNumberOfYears + " Year(s) - Error!! The Passport Expiry can not be more than 5 to 10 years. "); 
	    //Residency Issue Date Result
	    if (ResidencyIssueYear >= 2010)
		    System.out.println("Residency Issue Date: (dd/mm/yyyy)  " + ResidencyIssueDay + "/" + ResidencyIssueMonth + "/" + ResidencyIssueYear + " - ");
		    else System.out.println("Residency Issue Date: (dd/mm/yyyy)  " + ResidencyIssueDay + "/" + ResidencyIssueMonth + "/" + ResidencyIssueYear + " Error!! Residency Issue Date should be more than 10 Years. ");
	    //Residency Expiry Date Result
	    if (ResidencyExpiryYear >= 2019)
		    System.out.println("Residency Expiry Date: (dd/mm/yyyy)  " + ResidencyExpiryDay + "/" + ResidencyExpiryMonth + "/" + ResidencyExpiryYear + " Approximately after " + AfterPeriod + " Year(s).");
		    else System.out.println("Residency Expiry Date: (dd/mm/yyyy)  " + ResidencyExpiryDay + "/" + ResidencyExpiryMonth + "/" + ResidencyExpiryYear + " Error!! Residency is expired. ");
	    
	    
	    System.out.println("");
	    System.out.println("------------------------------------------------");
	    System.out.println("                     The End                    ");
	    System.out.println("------------------------------------------------");
	    System.out.println("");
	    
	    

	}

}