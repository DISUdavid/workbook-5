package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asset> moneyMakers = new ArrayList<>();

        Asset a1 = new House("777 Wall Street", 2, 950,6,"Affordable house in this economy", "April 2020", 20000);
        moneyMakers.add(a1);

        Asset a2 = new Vehicle("DuneBuggy",2025,111, "play car", "May 2020", 12000);
        moneyMakers.add(a2);

        for (Asset a: moneyMakers){
            if (a instanceof House){
                System.out.println("House");
                House house = (House)a;
                System.out.println("Address is: " + house.getAddress());
            }
            if (a instanceof Vehicle){
                System.out.println("Vehicle");
                Vehicle vehicle = (Vehicle)a;
                System.out.println("Make and Model is: " + vehicle.getMakeModel());
            }if (a instanceof Cash){
                System.out.println("Cash");
                Cash stash = (Cash)a;
                System.out.println("Cash amount is: " + stash);
            }
            System.out.println("Description is: " + a.getDescription());
        }




//        Asset a3 = new Cash(500000.55,"Money under the bed", "May 14", 0);
//        moneyMakers.add(a3);


//        System.out.println(moneyMakers);




    }


}
