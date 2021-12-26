package com.company;

public class Cargo_Flights extends Flight {
     private int Load_In_Tons;
     private int Cost_per_Ton;

    public Cargo_Flights(int flight_Number, int duration, Airport departing_Airport, Airport arrival_Airport, Cargo aircraft, com.company.Pilot pilot, int load_In_Tons, int cost_per_Ton) {
        super(flight_Number, duration, departing_Airport, arrival_Airport, aircraft, pilot);
        Load_In_Tons = load_In_Tons;
        Cost_per_Ton = cost_per_Ton;
    }

    public int getLoad_In_Tons() {
        return Load_In_Tons;
    }

    public void setLoad_In_Tons(int load_In_Tons) {
        Load_In_Tons = load_In_Tons;
    }

    public int getCost_per_Ton() {
        return Cost_per_Ton;
    }

    public void setCost_per_Ton(int cost_per_Ton) {
        Cost_per_Ton = cost_per_Ton;
    }
   public int get_revenue(){
        return getCost_per_Ton()*getLoad_In_Tons();
   }

    @Override
    public String toString() {
        return super.toString()+
                " Load_In_Tons = " + Load_In_Tons +
                ", Cost_per_Ton = " + Cost_per_Ton ;
    }
}
