package com.expresslab.human;

public class Woman implements IHumann{
    public String name;
    public Woman() {

    }
    public Woman (String name){
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
        String name="Alisa";
        System.out.println("i m woman"+name);

    }

    @Override
    public void play() {
        System.out.println(" i like cooking");
    }
}
