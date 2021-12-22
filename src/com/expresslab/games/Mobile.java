package com.expresslab.games;

public class Mobile extends Single{
    private String name = "SubwaySurfers";
    private int score = 20000;

    public Mobile() {
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
