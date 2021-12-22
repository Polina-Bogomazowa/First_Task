package com.expresslab.games;

public class Chess extends Single{
    private String name = "chess";
    private int score = 16;

    public Chess() {
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
