public class Driver
{
    public static void main(String[] args)
    {
        // Create a Car object
        Car myCar = new Car("Ferrari", 100);
        // Print out the model
        System.out.println(myCar.getModel());
        // Print out the fuelLevel
        System.out.println(myCar.getFuelLevel());
        // Print how many miles are left with 23 mpg
        System.out.println(myCar.milesLeft(23));
        // Print the object
        System.out.println(myCar.toString());
        // Create an ElectricCar object
        ElectricCar myElectricCar = new ElectricCar("Tesla", 120);
        // Print out the model
        System.out.println(myElectricCar.getModel());
        // Print out the fuelLevel
        System.out.println(myElectricCar.getFuelLevel());
        // Print how many miles are left with 400 miles per charge
        System.out.println(myElectricCar.milesLeft(400));
        // Print the object
        System.out.println(myElectricCar.toString());
    }
}
