//Code version 1


import java.util.Scanner;
public class GeneralTravelForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		PassportExpiryDay,
		PassportExpiryMonth,
		PassportExpiryYear,
		PassportExpiryDate0,    //Need to review this point.
		ResidencyIssueDay,
		ResidencyIssueMonth,
		ResidencyIssueYear,
		ResidencyIssueDate,
		ResidencyExpiryDay,
		ResidencyExpiryMonth,
		ResidencyExpiryYear,
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
	    System.out.println("00966 500000000 / 00966 012 6000000");
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
		PassportExpiryDate0 = 0;

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
	    System.out.print("Date of Birth (dd/mm/yyyy):   " + BirthDay + "/" + BirthMonth + "/" + BirthYear + " - ");
	    System.out.println("Approxmately " + Age + "Years Old");
	    System.out.println("Travel Date (dd/mm/yyyy):  " + TravelDay + "/" + TravelMonth + "/" + TravelYear + " - ");
	    System.out.println("Telephone umber: " + ContactNumber);
	    System.out.println("Religion: " + Religion);
	    System.out.println("Faith: " + Faith);
	    System.out.println("Email Address: " + EmailAddress);
	    System.out.println("Contact Address: " + ContactAddress);
	    System.out.println("Job title: " + JobTitle);
	    System.out.println("Marital Status: " + MaritalStatus);
	    System.out.println("Name of Mother: " + NameOfMother);
	    System.out.println("Passport Number: " + PassportNumber);
	    System.out.print("Passport Expiry Date: (dd/mm/yyyy)  " + PassportExpiryDay + "/" + PassportExpiryMonth + "/" + PassportExpiryYear + " - ");
	    System.out.println( "Approxmately after " + PassportExpiryDate0 + " Years"); 
	    System.out.println("Residency Issue Date: (dd/mm/yyyy)  " + ResidencyIssueDay + "/" + ResidencyIssueMonth + "/" + ResidencyIssueYear + " - ");
	    System.out.println("Residency Expiry Date: (dd/mm/yyyy)  " + ResidencyExpiryDay + "/" + ResidencyExpiryMonth + "/" + ResidencyExpiryYear + " - ");
	    
	    
	    System.out.println("");
	    System.out.println("------------------------------------------------");
	    System.out.println("                     The End                    ");
	    System.out.println("------------------------------------------------");
	    System.out.println("");
	    
	    

	}

}