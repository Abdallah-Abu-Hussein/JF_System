package com.company;

import java.util.ArrayList;

public class Pilot extends Person {
   private int Flying_Hours;
   ArrayList<String>Spoken_languages;

    public Pilot(String name, String nationality, int passport_Number, int flying_Hours) {
        super(name, nationality, passport_Number);
        Flying_Hours = flying_Hours;
    }

    public int getFlying_Hours() {
        return Flying_Hours;
    }

    public void setFlying_Hours(int flying_Hours) {
        Flying_Hours = flying_Hours;
    }
}
