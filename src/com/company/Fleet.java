package com.company;

import java.util.ArrayList;

public class Fleet {
    double firePowerSum;
    int passengerSum, cannonSum;

    public double getFirePowerSum() {
        return firePowerSum;
    }

    public void setFirePowerSum(double firePowerSum) {
        this.firePowerSum = firePowerSum;
    }

    public int getPassengerSum() {
        return passengerSum;
    }

    public void setPassengerSum(int passengerSum) {
        this.passengerSum = passengerSum;
    }

    public int getCannonSum() {
        return cannonSum;
    }

    public void setCannonSum(int cannonSum) {
        this.cannonSum = cannonSum;
    }

    ArrayList<Ship> shipList = new ArrayList<>();

    public void addToFleet(Ship s){
        shipList.add(s);
    }
    public void fleetFirePower(){

    }
}
