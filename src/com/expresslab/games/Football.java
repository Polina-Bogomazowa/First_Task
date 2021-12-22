package com.expresslab.games;

public class Football extends Team{
    private String name = "football";
    private int score = 2;

    public Football() {
        super(name, score);
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
