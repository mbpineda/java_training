package M2_Acitivty6;


public class Car extends Vehicle implements Refuelable {

    public Car(String brand) {
        super(4, brand); 
    }

    @Override
    public void startEngine() {
        System.out.println( "Car with brand " + brand + " engine started... ");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + brand + "...");
    }
}
