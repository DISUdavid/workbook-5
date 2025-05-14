package com.pluralsight;

public class HoverCraft extends Vehicle {
    boolean travelOnWater;

    public HoverCraft(boolean canTransport, boolean machine, boolean travelOnLand, String color, int numberOfPassengers, int fuelCapacity, int cargoCapacity, boolean travelOnWater) {
        super(canTransport, machine, travelOnLand, color, numberOfPassengers, fuelCapacity, cargoCapacity);
        this.travelOnWater = travelOnWater;
    }
}
