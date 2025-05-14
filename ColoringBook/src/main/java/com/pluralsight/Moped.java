package com.pluralsight;

public class Moped extends Vehicle {
    private boolean twoWheels;

    public Moped(){}

    public Moped(boolean canTransport, boolean machine, boolean travelOnLand, String color, int numberOfPassengers, int fuelCapacity, int cargoCapacity, boolean twoWheels) {
        super(canTransport, machine, travelOnLand, color, numberOfPassengers, fuelCapacity, cargoCapacity);
        this.twoWheels = twoWheels;
    }
}
