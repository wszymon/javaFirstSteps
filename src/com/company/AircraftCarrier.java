package com.company;

public class AircraftCarrier extends Destroyer {
    int allowableNumberOfAirplanes;

    public int getAllowableNumberOfAirplanes() {
        return allowableNumberOfAirplanes;
    }

    public void setAllowableNumberOfAirplanes(int allowableNumberOfAirplanes) {
        this.allowableNumberOfAirplanes = allowableNumberOfAirplanes;
    }

    public AircraftCarrier() {
    }

    @Override
    public String toString() {
        return "AircraftCarrier{" +
                "id=" + id +
                ", allowableNumberOfAirplanes=" + allowableNumberOfAirplanes +
                ", firePower=" + firePower +
                ", cannonAmount=" + cannonAmount +
                ", displacement=" + displacement +
                ", field=" + field +
                ", passengersAmount=" + passengersAmount +
                '}';
    }
}
