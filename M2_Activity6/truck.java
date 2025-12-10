package M2_Acitivty6;


public class truck extends Vehicle implements Refuelable {

    public truck(String brand, int numberOfWheels) {
        super(numberOfWheels, brand); 
    }

    @Override
    public void startEngine() {
        System.out.println ("Truck with brand " + brand + " engine started... ");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + brand + "...");
    }
}

