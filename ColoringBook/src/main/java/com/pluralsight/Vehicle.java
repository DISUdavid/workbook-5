package com.pluralsight;

public class Vehicle {
    boolean canTransport;

    public Vehicle(){}

    public Vehicle(boolean canTransport, boolean machine, boolean travelOnLand, String color, int numberOfPassengers, int fuelCapacity, int cargoCapacity) {
        this.canTransport = canTransport;
        this.machine = machine;
        this.travelOnLand = travelOnLand;
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.fuelCapacity = fuelCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    boolean machine;
    boolean travelOnLand;
    String color;
    int numberOfPassengers;
    int cargoCapacity;
    int fuelCapacity;

    public boolean isCanTransport() {
        return canTransport;
    }

    public void setCanTransport(boolean canTransport) {
        this.canTransport = canTransport;
    }

    public boolean isMachine() {
        return machine;
    }

    public void setMachine(boolean machine) {
        this.machine = machine;
    }

    public boolean isTravelOnLand() {
        return travelOnLand;
    }

    public void setTravelOnLand(boolean travelOnLand) {
        this.travelOnLand = travelOnLand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
