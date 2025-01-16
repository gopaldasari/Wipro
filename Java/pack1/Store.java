package pack1;

import java.util.Scanner;

public class Store 
{
	// Declare product quantities and prices for different categories
	int[] quantities = new int[12]; // Stores quantities for all items
	final int[] PRICES = {200, 100, 150, 40, 35, 40, 50, 60, 45, 200, 100, 25};
	final String[] ITEMS = {"APPLES", "BANANAS", "ORANGES", "POTATOES", "CARROT", "TAMATOES","RED GRAM", "BLACK GRAM", "WHITE GRAM", "CHILLI POWDER", "TUMERIC POWDER", "SALT POWDER"};

	Scanner sc = new Scanner(System.in);

	// Main method to start the shopping process
	public static void main(String[] args) 
	{
		System.out.println("##########---WELCOME TO BIG BAZAAR---##########");
		Store store = new Store();
		store.showCategories();
		System.out.println("##########---Thank You For Visiting Our Store---##########");
	}

	// Method to display the categories
	private void showCategories() 
	{
		System.out.println("                                                ");
		System.out.println("|----Available Categories-----|");
		System.out.println("|----1 FRUITS---------------- |");
		System.out.println("|----2 VEGETABLES-------------|");
		System.out.println("|----3 GRAMS------------------|");
		System.out.println("|----4 COOKING POWDERS--------|");
		System.out.println("|-----------------------------|");
		System.out.println("                                                ");
		System.out.print("Select the category: ");
		int choice = sc.nextInt();
		switch (choice) 
		{
			case 1 -> showItems(0, 2); // Fruits
			case 2 -> showItems(3, 5); // Vegetables
			case 3 -> showItems(6, 8); // Grams
			case 4 -> showItems(9, 11); // Powders
			default -> 
			{
				System.out.println("Please select a valid option from the list.");
				showCategories();
			}
		}
	}

	// Method to display items within the selected category
	private void showItems(int start, int end) 
	{
		System.out.println("                                                ");
		for (int i = start; i <= end; i++) 
		{
			System.out.println("|---" + (i + 1) + " " + ITEMS[i] + " ===> 1KG ===> " + PRICES[i] + " Rs/-|");
		}
		System.out.println("|-----------------------------------------|");
		System.out.print("Select the product code: ");
		int productCode = sc.nextInt();
		if (productCode >= start + 1 && productCode <= end + 1) 
		{
			processItem(productCode - 1); // Process the selected item
		} 
		else 
		{
			System.out.println("Entered product code is not valid.");
			showItems(start, end);
		}
	}

	// Process the selected item (asking for quantity and calculating price)
	private void processItem(int productIndex) 
	{
		System.out.print("Please enter required quantity in KG: ");
		int quantity = sc.nextInt();
		quantities[productIndex] = quantity;
		int totalPrice = quantity * PRICES[productIndex];
		System.out.println(ITEMS[productIndex] + " quantity = " + quantity + " KG.");
		System.out.println("Total price for " + ITEMS[productIndex] + " = " + totalPrice + " Rs/-");

		continueShopping();
	}

	// Ask user if they want to continue shopping or view the bill
	private void continueShopping() 
	{
		System.out.println("                                                ");
		System.out.println("Continue shopping: Press 1 || For bill: Press 2 || Exit: Press 3 ");
		System.out.print("Choose an option: ");
		int press = sc.nextInt();
		switch (press) 
		{
			case 1 -> showCategories();
			case 2 -> generateBill();
			case 3 -> System.out.println("Exiting... Thank you!");
			default -> 
			{
				System.out.println("Invalid option. Try again.");
				continueShopping();
			}
		}
	}

	// Generate the bill based on the items selected
	private void generateBill() 
	{
		sc.nextLine(); // Clear the buffer
		System.out.println("Enter following details:");
		System.out.print("Customer Name: ");
		String name = sc.nextLine();
		System.out.print("Phone Number: ");
		long number = sc.nextLong();

		System.out.println("                                                ");
		System.out.println("##########------------BILL------------##########");
		int totalBill = 0;

		// Print the bill for each item selected
		for (int i = 0; i < ITEMS.length; i++) 
		{
			if (quantities[i] > 0) 
			{
				int itemTotal = quantities[i] * PRICES[i];
				System.out.println("------------------------------------------------");
				System.out.println((i + 1) + " " + ITEMS[i] + " ===> " + quantities[i] + "KG ===> " + itemTotal + " Rs/-");
				totalBill += itemTotal;
			}
		}

		// Apply discount if the bill is above 1000 Rs
		if (totalBill > 1000) 
		{
			int discount = (totalBill * 5) / 100;
			System.out.println("Total bill = " + totalBill + " Rs/-");
			System.out.println("5% Discount applied: " + discount + " Rs/-");
			totalBill -= discount;
		} 
		else 
		{
			System.out.println("Discount is not applied as the bill is below 1000 Rs/-");
		}

		System.out.println("================================================");
		System.out.println("Final bill amount = " + totalBill + " Rs/-");
		System.out.println("================================================");
		System.out.println("You have saved " + (totalBill > 1000 ? (totalBill + 5) - totalBill : 0) + " Rs/-");
		System.out.println("                                                   ");
		System.out.println("--------CUSTOMER DETAILS--------");
		System.out.println("Customer Name: Mr. " + name);
		System.out.println("Phone Number: " + number);
		System.out.println("                                                         ");
	}
}
