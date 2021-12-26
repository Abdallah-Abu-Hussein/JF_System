package com.company;

import java.util.ArrayList;

public class Airport {
    private String Name;
    private String City;
    private String Country;
    ArrayList<Flight> Departing_flights = new ArrayList<>();
    ArrayList<Flight> Arrival_flights = new ArrayList<>();

    public Airport(String name, String city, String country) {
        Name = name;
        City = city;
        Country = country;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Name='" + Name + '\'' +
                ", City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                '}'+ '\n' ;
    }
}

