package com.company;

public class Destroyer extends Ship{
    double firePower;
    int cannonAmount;

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

    @Override
    public String toString() {
        return "Destroyer{" +
                "id=" + id +
                ", firePower=" + firePower +
                ", cannonAmount=" + cannonAmount +
                ", displacement=" + displacement +
                ", field=" + field +
                ", passengersAmount=" + passengersAmount +

                '}';
    }
}
