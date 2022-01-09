package com.expresslab.games;

public class Chess extends Single{
    private String name = "chess";
    private int score = 16;

    public Chess(String name, int score) {
        super(name, score);
    }
    public Chess(String s) {
        super();


    }

    public Chess() {

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
