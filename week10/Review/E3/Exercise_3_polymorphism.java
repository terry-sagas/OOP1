package week10.Review.E3;

public class Exercise_3_polymorphism {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bike bike = new Bike();
        
        System.out.println("Super class");
        vehicle.setSpeed(0);
        vehicle.setAction("N/A");
        vehicle.drive();
        System.out.println("Car Sub Class");
        car.setSpeed(80);
        car.setAction("pedal to metal");
        car.drive();
        System.out.println("Bike Sub Class");
        bike.setSpeed(8);
        bike.setAction("Biking is fun!");
        bike.drive();



    }

}
