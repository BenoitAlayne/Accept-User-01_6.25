import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	int num = 0;
	
	while(num <= 0 || num > 5){
		System.out.println("Enter a number from 1 to 5: ");
			try{
				num = scanner.nextInt();
				
				if(num <= 0 || num > 5){
					System.out.println("Invalid number, Please try again.");
					}
				}
				
			catch(java.util.InputMismatchException e){
				System.out.println("Invalid response, Please try again.");
				scanner.next();
				num = 0;
			}
		}
	
	scanner.close();
	System.out.println("You entered: " + num);
	}
}