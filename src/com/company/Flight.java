package com.company;

import java.util.ArrayList;

public class Flight {
    private int Flight_Number;
    private int Duration;
    private Airport Departing_Airport;
    private Airport Arrival_Airport;
    private Aircraft Aircraft;
    private Pilot Pilot;
    ArrayList<Passenger>Passengers;

    public Flight(int flight_Number, int duration, Airport departing_Airport, Airport arrival_Airport, com.company.Aircraft aircraft, com.company.Pilot pilot) {
        Flight_Number = flight_Number;
        Duration = duration;
        Departing_Airport = departing_Airport;
        Arrival_Airport = arrival_Airport;
        Aircraft = aircraft;
        Pilot = pilot;
    }

    public int getFlight_Number() {
        return Flight_Number;
    }

    public void setFlight_Number(int flight_Number) {
        Flight_Number = flight_Number;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public Airport getDeparting_Airport() {
        return Departing_Airport;
    }

    public void setDeparting_Airport(Airport departing_Airport) {
        Departing_Airport = departing_Airport;
    }

    public Airport getArrival_Airport() {
        return Arrival_Airport;
    }

    public void setArrival_Airport(Airport arrival_Airport) {
        Arrival_Airport = arrival_Airport;
    }

    public com.company.Aircraft getAircraft() {
        return Aircraft;
    }

    public void setAircraft(com.company.Aircraft aircraft) {
        Aircraft = aircraft;
    }

    public com.company.Pilot getPilot() {
        return Pilot;
    }

    public void setPilot(com.company.Pilot pilot) {
        Pilot = pilot;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "Flight_Number=" + Flight_Number +
                ", Duration=" + Duration +
                ", Departing_Airport=" + Departing_Airport +
                ", Arrival_Airport=" + Arrival_Airport +
                ", Aircraft=" + Aircraft +
                ", Pilot=" + Pilot +
                ", Passengers=" + Passengers +
                '}';
    }
}
