package com.expresslab.stadium;

public class Stadium {
    private  IChempionship chempionship;
    private String year;

    public Stadium(){
    }

    public Stadium(String year){
        this.year = year;
    }

    public String getYear(){
        return this.year;
    }

    public void setChampionship(IChempionship chempionship){
        this.chempionship = chempionship;
    }
    public IChempionship getChempionship(){
        return this.chempionship;
    }
}
