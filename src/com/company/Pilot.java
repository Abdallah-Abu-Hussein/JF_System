package com.company;

import java.util.ArrayList;

public class Pilot extends Person {
   private int Flying_Hours;
   ArrayList<String>Spoken_languages = new ArrayList<>();

    public Pilot(String name, String nationality, int passport_Number) {
        super(name, nationality, passport_Number);
    }

    public int getFlying_Hours() {
        return Flying_Hours;
    }

    public void setFlying_Hours(int flying_Hours) {

        Flying_Hours = flying_Hours;
    }
    public void add_language(String str){
        Spoken_languages.add(str);
    }

    @Override
    public String toString() {
        return '\n'+super.toString()+
                "  Flying_Hours=" + Flying_Hours +
                ", Spoken_languages=" + Spoken_languages+'\n'
                ;
    }
}
