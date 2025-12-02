/**
 * 
 */
package activity3;
import java.util.*;


/**
 * 
 */
public class Activity3 {
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
				
	}
	
	public static int diff(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int prod(int num1, int num2) {
		return num1 * num2;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    System.out.print("Enter 1st integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter 2nd integer: ");
		int num2 = input.nextInt();
		
		int sum = sum(num1,num2);
		int diff = diff(num1, num2);
		int prod = prod(num1, num2);
		
		System.out.println("sum: " + sum);
		System.out.println("difference: " + diff);
		System.out.println("product: " + prod);
		
				

	}

}
