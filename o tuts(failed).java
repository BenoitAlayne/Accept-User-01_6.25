import java.util.Scanner;

public class Benoit{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your PRELIM grades per Subject");
		System.out.print("Math: ");
		int math = scanner.nextInt();
		System.out.print("Science: ");
		int science = scanner.nextInt();
		System.out.print("Filipino: ");
		int filipino = scanner.nextInt();
		System.out.print("MAPEH: ");
		int mapeh = scanner.nextInt();
		System.out.print("ESP: ");
		int esp = scanner.nextInt();
		
		
		System.out.println("Enter you MIDTERM grades per Subject");
		System.out.print("Math: ");
		int math2 = scanner.nextInt();
		System.out.print("Science: ");
		int science2 = scanner.nextInt();
		System.out.print("Filipino: ");
		int filipino2 = scanner.nextInt();
		System.out.print("MAPEH: ");
		int mapeh2 = scanner.nextInt();
		System.out.print("ESP: ");
		int esp2 = scanner.nextInt();
		
		System.out.println("Enter your FINALS' grade per Subject");
		System.out.print("Math: ");
		int math3 = scanner.nextInt();
		System.out.print("Science: ");
		int science3 = scanner.nextInt();
		System.out.print("Filipino: ");
		int filipino3 = scanner.nextInt();
		System.out.print("MAPEH: ");
		int mapeh3 = scanner.nextInt();
		System.out.print("ESP: ");
		int esp3 = scanner.nextInt();
	
	
	double mathPremidfinals = (math + math2 + math3) / 3;
	double sciencePremidfinals = (science + science2 + science3) / 3;
	double filipinoPremidfinals = (filipino + filipino2 + filipino3) / 3;
	double mapehPremidfinals = (mapeh + mapeh2 + mapeh3) / 3;
	double espPremidfinals = (esp + esp2 + esp3) / 3;
	
	double overallGrades = (mathPremidfinals + sciencePremidfinals + filipinoPremidfinals + mapehPremidfinals + espPremidfinals) / 5;
	
	System.out.println("Your GWA is: " + overallGrades);
	
	if (overallGrades >= 98.0)
	{System.out.println("You are ranked as: With Highest Honor");} 
	
	 else if (overallGrades >= 95.0)
	{System.out.println("You are ranked as: With High Honor");}
	
	else if (overallGrades >= 89.0)
	{System.out.println("You are ranked as: With Honor" );}
		
	else {System.out.print("INVALID RESULT");}
	
		
	scanner.close();		
		
		}
	}
