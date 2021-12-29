package com.expresslab.stadium;

public class Fighting implements IChempionship{
    private String year;

    @Override
    public void printInfo() {

    }

    public void printInform(){
         String year="2022";
        System.out.println("Welcome to the Hunger Games "+year);
    }

    /*@Override
    public void printInformation() {

    }*/
    public Fighting(){
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return this.year;
    }


    public void printInfo(String year1){
        String year2="2020";
        int number2 = Integer.parseInt(year2);
        int number1 = Integer.parseInt(year1);
        System.out.println("Welcome to the Hunger Games two "+(year2+year1));
        System.out.println(number1+number2);
    }

    public void printInform(String i_like_tacos) {
        System.out.println("i like tacos");
    }
}

