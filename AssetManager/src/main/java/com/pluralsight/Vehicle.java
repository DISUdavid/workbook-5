package com.pluralsight;

public class Vehicle extends Asset{

    String makeModel;
    int year;
    int odometer;


    public Vehicle(String makeModel, int year, int odometer, String description, String dateAcquired, double originalCost) {
        super(description,dateAcquired,originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;


    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
       if(this.year <= 3){

       }



        return 0;
    }
}
