
class Vehicle {

    void drive() {
        System.out.println("The vehicle is fine.");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Repairing a car");
    }
}


class Main {

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();

        System.out.print("Vehicle: ");
        myVehicle.drive();

        System.out.print("Car: ");
        myCar.drive();
    }
}
