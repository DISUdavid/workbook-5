package com.pluralsight;

public class SemiTruck extends Vehicle{
    boolean hasCargo;

    public SemiTruck(boolean canTransport, boolean machine, boolean travelOnLand, String color, int numberOfPassengers, int fuelCapacity, int cargoCapacity, boolean hasCargo) {
        super(canTransport, machine, travelOnLand, color, numberOfPassengers, fuelCapacity, cargoCapacity);
        this.hasCargo = hasCargo;
    }
}
