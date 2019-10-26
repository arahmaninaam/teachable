import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
	
		Scanner x = new Scanner(System.in); 
		
		
		System.out.println("Welcome to Body Mass Index (BMI) Calculator."); 
        System.out.println("Please Answer the bellow Questions :)"); 
        
        System.out.print("Type your Weight: "); 
        double weight = x.nextDouble();
        
        System.out.print("Type your Hight: "); 
        double hight = x.nextDouble();
        
        double BMI = ( weight ) /( hight + hight ); 
        System.out.println("You BMI Result is " + BMI + ".");
        
        if (BMI < 18.55)
            System.out.println("You are Under Weight.");
        else if (BMI < 25 && BMI >= 18.5)
            System.out.println("You Weight is Normal.");
        
        else if (BMI < 30 && BMI >= 25)
            System.out.println("You are over Weight.");
        
        else if (BMI >= 30)
            System.out.println("You have excessive Obesity.");
	}
}
