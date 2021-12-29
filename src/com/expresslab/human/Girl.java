package com.expresslab.human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Girl {
    public void showTheGirl(){
        List<String> ListGirl = new ArrayList<String>();
        ListGirl.add("Anna");
        ListGirl.add("Sofia");
        ListGirl.add("Svetlana");
        //System.out.println(ListGirl);
        for(String a : ListGirl){
            System.out.println(a);
        }
        System.out.println("/////////////////////////////");
        boolean wasElementRemoved = ListGirl.remove("Svetlana");
        for(String a : ListGirl){
            System.out.println(a);
        }



    }
    public void showThePlanets(){

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, mars,earth,
                jupiter, saturn, uranus, neptune));
        Collections.sort(solarSystem);
        System.out.println(solarSystem);
    }
}
