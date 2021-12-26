package com.company;

public class Person {
   private String Name;
   private String Nationality;
   private int passport_Number;

    public Person(String name, String nationality, int passport_Number) {
        Name = name;
        Nationality = nationality;
        this.passport_Number = passport_Number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public int getPassport_Number() {
        return passport_Number;
    }

    public void setPassport_Number(int passport_Number) {
        this.passport_Number = passport_Number;
    }

    @Override
    public String toString() {
        return
                "Name = '" + Name + '\'' +
                ", Nationality = ' " + Nationality + '\'' +
                ", passport_Number = " + passport_Number ;
    }
}
