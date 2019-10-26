import java.util.Scanner;
public class Simple_Averaging_Program {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int total = 0;
		int garde;
		int average;
		int counter = 0;
		
		while (counter < 10) {
			garde = input.nextInt();
			total = total + garde;
			counter++;
		}
		average = total/10;
		System.out.println("Your average is "+ average);

	}

}
