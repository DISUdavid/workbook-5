package com.pluralsight;

public class Car extends Vehicle {
    boolean fourDoors;

    public Car(boolean canTransport, boolean machine, boolean travelOnLand, String color, int numberOfPassengers, int fuelCapacity, int cargoCapacity, boolean hasFourDoors) {
        super(canTransport, machine, travelOnLand, color, numberOfPassengers, fuelCapacity, cargoCapacity);
        this.fourDoors = hasFourDoors;
    }
}
