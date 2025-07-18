import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);	
	String space = "            |            ";
	
	System.out.println("1" + space + "2" + space + "3");	
		
	System.out.println("");
	System.out.print("Choose a number from above: ");
try{	int number = scanner.nextInt();
	
	if (number == 1){
		System.out.print("You chose 1");
		}
		else if (number == 2){
			System.out.print("You chose 2");
		}
		else if (number == 3){
			System.out.print("You chose 3");
		}
		
		else{
			System.out.print("That's invalid");
			}
		
	}
		catch (java.util.InputMismatchException e){ System.out.print("That's invalid"); }
		
		scanner.close();
	}
}