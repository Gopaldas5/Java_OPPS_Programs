package Abstraction;

abstract class Vehicle {

    abstract void start();
}
class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Start with key");
    }
}
class Scooter extends Vehicle{

    @Override
    void start() {
        System.out.println("Start with kick");
    }
}
class VehicleRunner{
    public static void main(String[] args) {
        Vehicle obj = new Car();
        obj.start();
        Vehicle obj1 = new Scooter();
        obj1.start();

    }
}



