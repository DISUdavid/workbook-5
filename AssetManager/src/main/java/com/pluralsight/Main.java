package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asset> moneyMakers = new ArrayList<>();

        Asset a1 = new House("777 Wall Street", 2, 950,6,"Affordable house in this economy", "April 2020", 20000);
        moneyMakers.add(a1);

        Asset a2 = new Vehicle("DuneBuggy",2025,111, "play car", "May 2020", 12000);
        moneyMakers.add(a2);

        System.out.println(moneyMakers);




    }


}
