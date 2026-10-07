package day08_type_conversion_and_type_casting.reference_type_casting.upcasting;

/**
 * Parent class.
 */
class Vehicle{
    
    public void start(){
        System.out.println("Vehicle is starting!");
    }
    
    public void move(){
        System.out.println("Vehicle is moving!");
    }
}

/**
 * Child class.
 */
class Car extends Vehicle{
    
    @Override
    public void move(){
        System.out.println("Car is moving on the road!");
    }
}

/**
 * Demonstrates upcasting from Car to Vehicle.
 * <p>
 * A Car IS-A Vehicle.
 * <p>
 * Therefore:
 * <p>
 * Car object → Vehicle reference
 * <p>
 * is a valid upcasting operation.
 */
public class CarVehicleUpcasting {
    public static void main(String[] args) {
        
        // Create a Car object.
        Car car = new Car();
        
        /*
         * Upcasting:
         *
         * The Car object is assigned to a Vehicle reference.
         *
         * No explicit cast is required.
         */
        Vehicle vehicle = car;
        
        /*
         * We can call methods declared in Vehicle.
         */
        vehicle.start();
        
        /*
         * This method is overridden by Car.
         *
         * Even though the reference type is Vehicle,
         * the actual object is still Car.
         *
         * Therefore, Car's implementation executes.
         */
        vehicle.move();;
    }
}
