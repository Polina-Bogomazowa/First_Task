package com.expresslab.games;

import java.util.Scanner;

public class Golf extends Single {
    private String name = "Golf";
    private int score = 222;

    public Golf(String name, int score) {

        super(name,score);
    }
    public Golf() {
        super();


    }
    public  void ResultOfScore(){
        try{
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter new score of Golf");
            int v = scanner1.nextInt();
            System.out.println("Final score is " + (score+v));
        }catch(Exception e){
            System.out.println("incorrect value of score");
        }

    }



    public void setName(String nameValue) {
        this.name = nameValue;
    }
    public String getName() {
        return this.name;
    }


    public int getScore() {
        return this.score;
    }

}
