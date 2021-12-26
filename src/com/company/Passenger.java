package com.company;
public class Passenger extends Person{
    private int Number_Of_trips;
    private int Ticket_Price;

    public Passenger(String name, String nationality, int passport_Number, int ticket_Price) {
        super(name, nationality, passport_Number);
        Ticket_Price = ticket_Price;
//        Number_Of_trips = 3;
    }

    public int getNumber_Of_trips() {
        return Number_Of_trips;
    }

    public void setNumber_Of_trips(int number_Of_trips) {
        Number_Of_trips = number_Of_trips;
    }

    public int getTicket_Price() {
        return Ticket_Price;
    }

    public void setTicket_Price(int ticket_Price) {
        Ticket_Price = ticket_Price;
    }

    @Override
    public String toString() {
        return "Passenger{" + super.toString()+
                "  Number_Of_trips= " + Number_Of_trips +
                ", Ticket_Price= " + Ticket_Price +
                '}'+'\n';
    }
}
