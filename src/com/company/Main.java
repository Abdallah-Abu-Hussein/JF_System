package com.company;

import java.util.Scanner;

public class Main {
//    [12/23 8:17 PM] Mohammed Mahmoud Eshtay

//    create flights
//
//    different types of flights
//
//    add passengers to the flights
//
//    add Cargo flights
//
//    display the arrival flights in some airport
//
//    display departing flights in some airport
//
//    display passengers for some flight
//
public static void main(String[] args) {
    System.out.println(" Welcome Home, Welcome to JK flight System Command line Interface, We don't have money to build real UI !!");
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//////////////// first test flight from Amman to Dubai, it's an Airliner filled with passengers \\\\\\\\\\\\\\\\\\\\\
    Airport A1 = new Airport("Queen Alia International Airport","Amman","jordan");
    Airport A2 = new Airport("United Arab Emirates Dubai International","Dubai","United Arab Emirates");

    Airliner AC1 = new Airliner("kia","Asac",684,200);

    Pilot p1 = new Pilot("jack","British",769854);

    Airliner_Flights f1 = new Airliner_Flights(54738389,33,A1,A2,AC1,p1);

    Cargo cargo = new Cargo("AirBas","me",56,44);

    Flight f = new Airliner_Flights(55,6,A1,A2,AC1,p1);
    Flight fe = new Cargo_Flights(66,3,A2,A1,cargo,p1,400,3);

    System.out.println(f.get_revenue());


//        filling the Airliner without fill method

//        for (int i = 1; i < AC1.getNumber_Of_Passengers()+1 ; i++) {
//            f1.add_passenger(new Passenger("Ali"+i,"jordanian",654,777));
//        }
//
//        System.out.println(f1.Passengers);

//        f1.fill_flight(); //*** if you want to test the method uncomment it from class Airliner flights ***



//************ TESTs with Sys.out **********


    //** first Airports **\\

//         System.out.println("Queen Alia International Airport info = \n"+A1);
//         System.out.println("United Arab Emirates Dubai International info = \n " + A2);

    //***checking list of flights for those Airports :

    //System.out.println("Departing_flights = "+A1.Departing_flights);

    //** this should be empty list =
    //System.out.println(A1.Arrival_flights);

//**********flight info *****************\\

//        System.out.println(" f1 revenue = "+f1.get_revenue());
//        System.out.println("Arrival_Airport = "+f1.getArrival_Airport());
//        System.out.println("List of passengers in Airliner flight f1  " + f1.Passengers);
//        System.out.println("f1.lap la la  test it your self");


/////////////////  test keeping track of a pilot's hours of flying  \\\\\\\\\\\\\

//    System.out.println(p1.getFlying_Hours());
// now let's add new flghts to the same pilot
//        Airliner_Flights f2 = new Airliner_Flights(54738389,3,A1,A2,AC1,p1);
//        Airliner_Flights f3 = new Airliner_Flights(54738389,5,A1,A2,AC1,p1);
//        Airliner_Flights f4 = new Airliner_Flights(54738389,12,A1,A2,AC1,p1);
//
//        System.out.println(p1.getFlying_Hours());
//        System.out.println("it's working سبهان الله !! ")
//

////////// test keeping track of a passenger number of trips \\\\\\\\\


// Passenger pa1 = new Passenger("toto","japan",666,16754);
//Airliner_Flights aa = new Airliner_Flights(444,5,A2,A1,AC1,p1);
//Airliner_Flights a = new Airliner_Flights(434,5,A2,A1,AC1,p1);
//a.add_passenger(pa1);
//aa.add_passenger(pa1);
//
//
//    System.out.println("Number of trips for toto :"+ pa1.getNumber_Of_trips());
//    System.out.println(aa.Passengers);
//    System.out.println(a.Passengers);

////////// Testing the Cargo stuff \\\\\\\\\



    Cargo_Flights ca = new Cargo_Flights(566,17,A1,A2,cargo,p1,1000,6);
//
//    System.out.println(cargo.getLoad_in_Ton()+" tons");
//    System.out.println("revenue: $ "+ca.get_revenue());



}



}
