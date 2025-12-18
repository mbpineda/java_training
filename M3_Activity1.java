/**
 * 
 */
package M3_Activity1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 */
public class M3_Activity1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner product1 = new Scanner(System.in);
		List<String> products = new ArrayList<>();
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		System.out.println("All Products:");
		System.out.println("1. " + products.get(0));
		System.out.println("2. " + products.get(1));
		System.out.println("3. " + products.get(2));
		System.out.println("4. " + products.get(3));
		System.out.println("5. " + products.get(4));
		
		products.add("Webcam");
		products.remove(1);
		
		System.out.println("After Adding and Removing Products");
		System.out.println("1. " + products.get(0));
		System.out.println("2. " + products.get(1));
		System.out.println("3. " + products.get(2));
		System.out.println("4. " + products.get(3));
		System.out.println("5. " + products.get(4));
		
		System.out.print("Enter product name to search: ");
		String n = product1.nextLine();
		
		boolean productFound = false;
		for(String product: products) {
			if (n == product) { 
				productFound = true;
			}
		}
		
		if (productFound) {
			System.out.println("Product found: " + n); 			
		} else {
			System.out.println("Product not found!"); 
		}

	}

}
