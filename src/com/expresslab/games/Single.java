package com.expresslab.games;

 public abstract class Single extends Game{
     public String name ="sinle default";
     public int thirdScore = 234;
    public Single(String name,int thirdScore){
        this.name=name;
        this.thirdScore = thirdScore;
    }
    public String play(){
    return ("single games are cool");
     }

  public Single(){

    }
    public String getName(){

        return this.name;

    }
    public void setName(String name){
        this.name = name;
    }
}
