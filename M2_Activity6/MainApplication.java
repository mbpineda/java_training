package M2_Acitivty6;


public class MainApplication {
    public static void main(String[] args) {
        
        Car car = new Car("Ford");
        truck truck = new truck("Hyundai", 10);

      
        System.out.println("--- Car actions ---");
        car.startEngine();
        car.refuel();
        System.out.println("--- Car Details ---");
        System.out.println("Car wheels: " + car.getNumberOfWheels());
        System.out.println("Car brand: " + car.getBrand());

        System.out.println("--- Truck actions ---");
        truck.startEngine();
        truck.refuel();
        System.out.println("--- Truck Details ---");
        System.out.println("Truck wheels: " + truck.getNumberOfWheels());
        System.out.println("Truck brand: " + truck.getBrand());

        // Destroy vehicles 
        System.out.println("\n--- Destroy vehicles ---");
        destroyVehicle(car);
        destroyVehicle(truck);
    }

  
    public static void destroyVehicle(Vehicle vehicle) {
        vehicle.destroy();
    }
}

