package com.company;

import java.util.ArrayList;
import java.util.List;

public class Black_Box {
    private static Black_Box obj;
    private ArrayList<String> events = new ArrayList<>();
    private Black_Box(){
    }
    public static Black_Box getInstance(){
        if (obj == null){
            obj = new Black_Box();
        }
        return obj;
    }
    public void addEvent(String e){
        events.add(e);
    }
    public ArrayList<String> displayEvents(){
        System.out.println(events);
        return events;

    }
    public void removeEvent(String str){
        events.remove(str);
    }

}
