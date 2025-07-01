import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome! This is Benoit's Cafe");
		System.out.println("What can I get for you?");
		
		boolean menuAnswer = false;

		while (!menuAnswer) {
			System.out.print("Press 'M' to see the menu^,^: ");
			String menu = scanner.nextLine();

			if (menu.equalsIgnoreCase("M")) {
				menuAnswer = true;

				// Display Orders
				System.out.println("     Drinks          ||     Foods");

				String[] drinks = {
					"1# Hot Coffee", 
					"2# Milky Matcha", 
					"3# Banana Milk", 
					"4# Iced Americano", 
					"5# Mango Soda"
				};

				String[] foods = {
					"A Garlic Bread", 
					"B Potato Tarts", 
					"C Carbonara", 
					"D Pizzalettos", 
					"E Burger Mons"
				};

				for (int i = 0; i < drinks.length; i++) {
					System.out.printf("%-20s || %-20s%n", drinks[i], foods[i]);
				}

				// Machine's Response for Orders (Drinks)
				boolean validInput = false;

				while (!validInput) {
					System.out.print("Type the corresponding '#' number to order a drink, type '6' if not: ");
					try {
						int drinksOrder = scanner.nextInt();
						scanner.nextLine(); // clear buffer

						switch (drinksOrder) {
							case 1:
								System.out.println("To confirm, your order is Hot Coffee :)");
								validInput = true;
								break;
							case 2:
								System.out.println("To confirm, your order is Milky Matcha :)");
								validInput = true;
								break;
							case 3:
								System.out.println("To confirm, your order is Banana Milk :)");
								validInput = true;
								break;
							case 4:
								System.out.println("To confirm, your order is Iced Americano :)");
								validInput = true;
								break;
							case 5:
								System.out.println("To confirm, your order is Mango Soda :)");
								validInput = true;
								break;
							case 6:
								System.out.println("Aww :(");
								validInput = true;
								break;
							default:
								System.out.println("Sorry but that doesn't match any order :((");
						}
					} catch (java.util.InputMismatchException e) {
						System.out.println("Oops! Sorry I don't get that, Invalid input.");
						scanner.nextLine(); // clear buffer
					}
				}

				// Machine's Response for Orders (Foods)
				boolean foodMenu = false;

				while (!foodMenu) {
					System.out.print("Order some foods? Type the corresponding letter next to the food you want: ");
					String foodsOrder = scanner.nextLine();

					if (foodsOrder.equalsIgnoreCase("A")) {
						System.out.println("To confirm, your order is Garlic Bread :)");
						foodMenu = true;
					} else if (foodsOrder.equalsIgnoreCase("B")) {
						System.out.println("To confirm, your order is Potato Tarts :)");
						foodMenu = true;
					} else if (foodsOrder.equalsIgnoreCase("C")) {
						System.out.println("To confirm, your order is Carbonara :)");
						foodMenu = true;
					} else if (foodsOrder.equalsIgnoreCase("D")) {
						System.out.println("To confirm, your order is Pizzalettos :)");
						foodMenu = true;
					} else if (foodsOrder.equalsIgnoreCase("E")) {
						System.out.println("To confirm, your order is Burger Mons :)");
						foodMenu = true;
					} else {
						System.out.println("Sorry I don't get your order, please try again :(");
					}
				}

			} else {
				System.out.println("Please input proper keys.");
			}
		}

		scanner.close();
	}
}