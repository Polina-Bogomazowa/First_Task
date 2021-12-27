package com.expresslab.games;

public abstract class Game {
    private String name ;
    public int firstScore = 30;
    public int secondScore = 40;
    private int thirdScore ;
    public String specialClothes = "" ;

public Game(){

}
    public Game(String name,int thirdScore ){
        this.name = name;
        this.thirdScore=thirdScore;

}
    public void setName(String nameValue){
          this.name = nameValue;
      }
     public String getName(){
          return this.name;
      }
    public void setSpecialClothes(String specialClothesValue){
        this.specialClothes = specialClothesValue;
    }
    public String getSpecialClothes(){
        return this.specialClothes;
    }

public abstract String play();

public void printPlay(){
    System.out.println("your game  "+ play() + " and it has score:" + thirdScore);
}

}
