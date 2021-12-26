package com.company;

public class Airliner extends Aircraft{
    private int Number_Of_Passengers;

    public Airliner(String model, String manufacture, int code, int number_Of_Passengers) {
        super(model, manufacture, code);
        Number_Of_Passengers = number_Of_Passengers;
    }

    public int getNumber_Of_Passengers() {
        return Number_Of_Passengers;
    }

    public void setNumber_Of_Passengers(int number_Of_Passengers) {
        Number_Of_Passengers = number_Of_Passengers;
    }
}
