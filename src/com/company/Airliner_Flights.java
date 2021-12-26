package com.company;

public class Airliner_Flights extends Flight{
    public Airliner_Flights(int flight_Number, int duration, Airport departing_Airport, Airport arrival_Airport, com.company.Aircraft aircraft, com.company.Pilot pilot) {
        super(flight_Number, duration, departing_Airport, arrival_Airport, aircraft, pilot);
    }

    public int get_revenue(){
        int total_ticket_revenue = 0;
        for (int i = 0; i <super.Passengers.size()-1 ; i++) {
            total_ticket_revenue+=super.Passengers.get(i).getTicket_Price();
        }
        return total_ticket_revenue;
    }
}
