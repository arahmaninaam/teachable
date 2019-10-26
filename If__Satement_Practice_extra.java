import java.util.Scanner;
public class If__Satement_Practice_extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the mark: "); 
		int mark = s.nextInt();
		char grade;
		if (mark > 100 || mark <0)
			System.out.print("Error");

		else {
			if (mark >= 90 && mark <= 100)
				grade = 'A';
			else if (mark >= 80 && mark < 90)
				grade = 'B';
			else if (mark >= 70 && mark < 80)
				grade = 'C';
			else if (mark >= 60 && mark < 70)
				grade = 'D';
			else
				grade ='F';
            System.out.println("Your grade = " + grade);
            
			
		}

	}

}
