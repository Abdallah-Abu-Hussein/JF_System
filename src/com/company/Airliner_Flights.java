package com.company;

public class Airliner_Flights extends Flight{
    public Airliner_Flights(int flight_Number, int duration, Airport departing_Airport, Airport arrival_Airport,Airliner aircraft,Pilot pilot) {
        super(flight_Number, duration, departing_Airport, arrival_Airport,aircraft, pilot);

    }

//    this method works But it's an over-kill, I just wanted to play with **class Casting** , you can fill the airliner
//     without caring about class casting in the main

//    public void fill_flight(){
//        for (int i = 0; i < Airliner.class.cast(super.getAircraft()).getNumber_Of_Passengers();i++) {
//            super.Passengers.add(new Passenger("abd"+i,"jordanian",5677+i,1000+1));
//            super.Passengers.get(i).setNumber_Of_trips(super.Passengers.get(i).getNumber_Of_trips()+1);
//        }
//    }

    @Override
    public int get_revenue(){
        int total_ticket_revenue = 0;
        for (Passenger passenger : super.Passengers) {
            total_ticket_revenue += passenger.getTicket_Price();
        }
        return total_ticket_revenue;
    }
}
