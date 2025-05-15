package com.pluralsight;

public abstract class Cash extends Asset {

    double stash;

    public Cash(double stash,String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public double getStash() {
        return stash;
    }

    public void setStash(double stash) {
        this.stash = stash;
    }

    @Override
    public double getValue() {
        return stash;
    }
}
