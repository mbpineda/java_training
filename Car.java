package M2_Activity3;

public class Car {
			String brand;
			String type;
			String color;
			
	//no args constructor
	public Car() {
		this.brand="unknown";
		this.type="unknown";
		this.color="unknown";
	}
	
	//parameterized
	public Car(String brand, String type, String color) {
		this.brand = brand;
		this.type = type;
		this.color = color;
	}
	
	public void showDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + type);
		System.out.println("Color: " + color);
	}
			
}
