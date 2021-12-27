package com.expresslab.human;

public class Man implements IHumann{
    public String name;
    public Man() {

    }
    public Man (String name){
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
        String name = "Patrik";
        System.out.println("i m man " + name);
    }

    @Override
    public void play() {
        System.out.println("i like minecraft");
    }
}
