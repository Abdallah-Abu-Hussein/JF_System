package com.company;

import java.util.ArrayList;

public class Flight {
    private int Flight_Number;
    private int Duration;
    private Airport Departing_Airport;
    private Airport Arrival_Airport;
    private Aircraft Aircraft;
    private Pilot Pilot;
    ArrayList<Passenger>Passengers = new ArrayList<>();

    public Flight(int flight_Number, int duration, Airport departing_Airport, Airport arrival_Airport,Aircraft aircraft, Pilot pilot) {
        Flight_Number = flight_Number;
        Duration = duration;
        Departing_Airport = departing_Airport;
        departing_Airport.Departing_flights.add(this);

        Arrival_Airport = arrival_Airport;
        arrival_Airport.Arrival_flights.add(this);

        Aircraft = aircraft;

        Pilot = pilot;
        Pilot.setFlying_Hours(Pilot.getFlying_Hours()+this.Duration);

    }
    public void add_passenger(Passenger p){
        Passengers.add(p);
        p.setNumber_Of_trips(p.getNumber_Of_trips()+1);
    }

    public int get_revenue(){
        System.out.println("No revenue of in superclass it's = ");
        return -1;
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

    public Aircraft getAircraft() {
        return Aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        Aircraft = aircraft;
    }

    public Pilot getPilot() {
        return Pilot;
    }

    public void setPilot(Pilot pilot) {
        Pilot = pilot;
    }

    @Override
    public String toString() {
        return
                "Flight_Number = " + Flight_Number +
                ", Aircraft = " + Aircraft +
                        ", Duration = " + Duration +
                '\n'+", Pilot= " + Pilot +'\n'+
                ", Departing_Airport = " + Departing_Airport +'\n'+
                ", Arrival_Airport = " + Arrival_Airport +'\n';

    }
}
