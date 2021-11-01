package com.company;

public class Ship {
    double sideA, sideB, displacement, field;
    int passengersAmount, id;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    public void setPassengersAmount(int passengersAmount) {
        this.passengersAmount = passengersAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double fieldCount(double sideA, double sideB) {
        return sideA * sideB;
    }

    public Ship() {
    }


    public Ship(int id, double sideA, double sideB) {
        this.id = id;
        this.sideA = sideA;
        this.sideB = sideB;
        this.field = fieldCount(sideA, sideB);
    }

    public Ship(int id, double sideA, double sideB, int passengersAmount) {
        this.id = id;
        this.sideA = sideA;
        this.sideB = sideB;
        this.passengersAmount = passengersAmount;
        this.field = fieldCount(sideA, sideB);
    }

    public Ship(int id, double sideA, double sideB, double displacement, int passengersAmount) {
        this.id = id;
        this.sideA = sideA;
        this.sideB = sideB;
        this.displacement = displacement;
        this.passengersAmount = passengersAmount;
        this.field = fieldCount(sideA, sideB);
    }
}