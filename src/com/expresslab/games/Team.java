package com.expresslab.games;
public abstract class Team extends Game{
    public Team(String name,int thirdScore){
        super (name,thirdScore);

    }
    public Team(){
        super();

    }
    public String play(){

        return ("team games are good for developing communication");
    }
}
