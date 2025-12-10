package M2_Acitivty6;


public abstract class Vehicle {
    private int numberOfWheels;
    protected String brand;
    
 

    public Vehicle(int numberOfWheels, String brand) {
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getBrand() {
        return brand;
    }
    
	

    
     public abstract void startEngine();

  
    public void destroy() {
        System.out.println("Destroying vehicle " + brand + "!!!");
    }
}

