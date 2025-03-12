import java.util.Scanner;

public class GradeCalculator {
   	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your score: ");
	int userInput = input.nextInt();

	
	if (userInput >= 90){
	System.out.println("Your Grade is: A");
	}
	else if (userInput >= 80){
	System.out.println("Your Grade is: B");
	}
	else if (userInput >= 70){
	System.out.println("Your Grade is: C");
	}
	else if (userInput >= 60){
	System.out.println("Your Grade is: D");
	}
	else {
	System.out.println("Your Grade is: E");
	}
	}
}