package com.expresslab.stadium;

public class Fighting implements IChempionship{
    public void printInfo(){
         String year="2022";
        System.out.println("Welcome to the Hunger Games "+year);
    }
    public void printInfo(String year){
        String year2="2020";
        System.out.println("Welcome to the Hunger Games two "+year2+year);
    }
}
