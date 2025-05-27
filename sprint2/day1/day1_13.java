package org.sprint2day1;
interface Vehicle {
    default void print() {
        System.out.println("I am a vehicle!");
    }
}
class Car implements Vehicle {
    @Override
    public void print() {
        System.out.println("Car's own print method.");
        Vehicle.super.print(); // Calling the default method from Vehicle interface
    }
}
public class day1_13 {
    public static void main(String[] args) {
        Car car = new Car();
        car.print();
    }
}
