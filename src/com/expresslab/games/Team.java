package com.expresslab.games;

public class Team extends Game{
    public Team(String name,int thirdScore){
        super (name,thirdScore);
    }
    public String play(){

        return ("team games are good for developing communication");
    }
}
