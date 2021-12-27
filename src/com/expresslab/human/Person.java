package com.expresslab.human;

public class Person implements IHumann{
    public String name;
    public Person() {

    }
    public Person (String name){
        this.name = name;
    }

    public void setName(String nameValue) {
        this.name = nameValue;
    }
    public String getName() {
        return this.name;
    }





    @Override
    public void say() {
        System.out.println("i m person ");

    }

    @Override
    public void play() {
        System.out.println("and i m playing in football");
    }
}
