package com.pluralsight;

import javax.management.ConstructorParameters;

public class Main {

    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println("My ride has: " + slowRide.getColor() + " and it's fuel capacity is: " + slowRide.getFuelCapacity());

        Car subaru = new Car(true,true,true,"Black",4,8,4,true);
        System.out.println("My new car is a: " + subaru.color + " Subaru");


    }


}
