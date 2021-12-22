package com.expresslab.games;

public class Paintball extends Team{
    private String name = "basketball";
    private int score = 50;

    public Paintball(String name, int thirdScore) {
        super(name, thirdScore);
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
