public class VehicleRunner
{
    public static void main(String[] args)
    {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn(90);
        myVehicle.brake(0.25);

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(-90); // inherited method
        myCar.brake(0.50); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR TEST CODE BELOW! ----
        // testing all available methods on a Bicycle object
        Bicycle myBicycle = new Bicycle("Training Wheels Bike", 2, 5);
        System.out.println(myBicycle.getName()); // inherited method
        System.out.println(myBicycle.getWheels()); // inherited method
        System.out.println(myBicycle.getGearCount()); // inherited method
        myBicycle.move(30); // inherited method
        myBicycle.turn(-90); // inherited method
        myBicycle.brake(0.50); // inherited method
        myBicycle.ringBell(); // method ONLY available on Bicycle objects

        // testing all available methods on a Motorcycle object
        Motorcycle myMotorcycle = new Motorcycle("Cool Motorcycle", 2, "Red");
        System.out.println(myMotorcycle.getName()); // inherited method
        System.out.println(myMotorcycle.getWheels()); // inherited method
        System.out.println(myMotorcycle.getColor()); // inherited method
        myMotorcycle.move(100); // inherited method
        myMotorcycle.turn(90); // inherited method
        myMotorcycle.brake(0.50); // inherited method
        myMotorcycle.vroom(); // method ONLY available on Motorcycle objects
        myMotorcycle.turnOnFrontLights(); // method ONLY available on Motorcycle objects



    }
}