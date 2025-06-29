import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("WELCOME TO GENERAL KNOWLEDGE TEST!");
        System.out.println("You have been given 10 questions to answer!");

        while (true) {
            System.out.println("Press 'S' to start and 'Q' to quit.");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                System.out.println("Thank you for running this code! I really appreciate your support — by Benoit :)");
                break;
            } 
            
            else if (input.equalsIgnoreCase("S")) {
                int score = 0; 

                System.out.println("1. What is the capital city of Japan?: ");
                String answer1 = scanner.nextLine();
                if (answer1.equalsIgnoreCase("Tokyo")) score++;

                System.out.println("2. Who wrote the play Romeo and Juliet?: ");
                String answer2 = scanner.nextLine();
                if (answer2.equalsIgnoreCase("William Shakespeare")) score++;

                System.out.println("3. What planet is known as the 'Red Planet'?: ");
                String answer3 = scanner.nextLine();
                if (answer3.equalsIgnoreCase("Mars")) score++;

                System.out.println("4. In which year did the Titanic sink?: ");
                int answer4 = scanner.nextInt();
                scanner.nextLine();
                if (answer4 == 1912) score++;

                System.out.println("5. What is the largest organ in the human body?: ");
                String answer5 = scanner.nextLine();
                if (answer5.equalsIgnoreCase("Skin")) score++;

                System.out.println("6. Who painted the Mona Lisa?: ");
                String answer6 = scanner.nextLine();
                if (answer6.equalsIgnoreCase("Leonardo da Vinci")) score++;

                System.out.println("7. What gas do plants absorb from the atmosphere?: ");
                String answer7 = scanner.nextLine();
                if (answer7.equalsIgnoreCase("Carbon Dioxide")) score++;

                System.out.println("8. What is the square root of 144?: ");
                int answer8 = scanner.nextInt();
                scanner.nextLine();
                if (answer8 == 12) score++;

                System.out.println("9. Who was the first person to walk on the Moon?: ");
                String answer9 = scanner.nextLine();
                if (answer9.equalsIgnoreCase("Neil Armstrong")) score++;

                System.out.println("10. What is the currency of South Korea?: ");
                String answer10 = scanner.nextLine();
                if (answer10.equalsIgnoreCase("Won")) score++;


                System.out.println("\nQuiz completed!");
                System.out.println("Your total score is: " + score + "/10");

                System.out.println("Press 'S' to retake or 'Q' to quit.");
            } else {
                System.out.println("Invalid input. Please type 'S' to start or 'Q' to quit.");
            }
        }

        scanner.close();
    }
}