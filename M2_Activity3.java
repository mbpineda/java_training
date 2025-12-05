/**
 * 
 */
package M2_Activity3;
import java.util.*;

/**
 * 
 */
public class M2_Activity3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// no args constructor
		Car car1 = new Car();
		car1.brand = "Ford";
		car1.type = "Ranger";
		car1.color = "Black";
		
		//using parameterized constructor
		Car car2 = new Car("BYD", "SUV", "Blue");
		
		System.out.println("--Display Car1 Info--");
		car1.showDetails();
		System.out.println("--Display Car2 Info--");
		car2.showDetails();
		
		

	}

}
