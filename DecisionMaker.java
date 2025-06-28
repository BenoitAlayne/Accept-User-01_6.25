import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("WELCOME TO DECISION MAKER!");
		
		String question = "";
		
		while(true){
		System.out.println("You can press (Q) to quit");
		
		System.out.println("Enter your question: ");
		question = scanner.nextLine();
		
		
		
		if (question.equalsIgnoreCase("Q")){
			System.out.println("Thank you for making me decide your fate! Hope to see you next time:)");	
			break;
		} 
		
		String decision = random.nextBoolean() ? "Yes" : "No";
		System.out.println("My answer to your question is " + decision );
			}
		
		scanner.close();
			
		
	}
}