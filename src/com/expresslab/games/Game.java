package com.expresslab.games;

public class Game {
    public String name= "" ;
    public int firstScore = 30;
    public int secondScore = 40;
    public String specialClothes = "" ;

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
}
