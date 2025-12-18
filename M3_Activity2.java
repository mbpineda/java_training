package M3_Activity2;

import java.util.*;

public class M3_Activity2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		String search;
		String item;
		
		
		HashSet<String> products = new HashSet<>();
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		
		do {
			System.out.println("===PRODUCT MENU===");
			System.out.println("1. Search a product");
			System.out.println("2. Add a product");
			System.out.println("3. Print all products and count");
			System.out.println("4. Exit");
			System.out.print("> ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				System.out.print("Enter product name to search: ");
				search = scanner.nextLine();
				// Search product
				if (products.contains(search)) {
					System.out.println("Product found: " + search);
				}
				else {
					System.out.println("Product not found " + search);
				}
				break;
			case 2:
				System.out.print("Enter product name to add: ");
				item = scanner.nextLine();
				products.add(item);
				System.out.println("Product added: " + item );
				break;
			case 3:
				System.out.println("All Product List: ");
				 for (String product : products) {
					 System.out.println("- " + product);
				 }
					 System.out.println("Total unique products: " + (products.size()));
				break;
			case 4:
				System.out.println("Exiting........");
				break;
				
			default:
				System.out.print("Invalid Option");
			}
			
		}
		while (choice != 4);
	}
}

	