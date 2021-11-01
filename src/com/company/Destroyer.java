package com.company;

public class Destroyer extends Ship{
    double firePower;

    public Destroyer() {
    }

    public double getFirePower() {
        return firePower;
    }

    public void setFirePower(double firePower) {
        this.firePower = firePower;
    }

    public int getCannonAmount() {
        return cannonAmount;
    }

    public void setCannonAmount(int cannonAmount) {
        this.cannonAmount = cannonAmount;
    }

    int cannonAmount;
}
