package com.pluralsight;

public class House extends Asset {

    String address;
    int condition; // 1-excellent,2-good,3-fair,4-poor
    int squareFoot;
    int lotSize;


    public House(String address, int condition, int squareFoot, int lotSize, String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        if (condition == 1) {
            return this.squareFoot * 180.00;
        } else if (condition == 2) {
             return this.squareFoot * 130.00;
        } else if (condition == 3) {
            return this.squareFoot * 90.00;
        } else if (condition == 4) {
            return this.squareFoot * 80.00;
        } else {
            throw new IllegalArgumentException("Invalid input: " + condition);
        }

    }
}
