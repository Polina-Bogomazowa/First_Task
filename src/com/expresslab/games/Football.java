package com.expresslab.games;

public class Football extends Team{
    private String name = "football";
    private int score = 2;

    public Football(String name, int score) {
        super(name, score);
    }
    public Football() {
        super();


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
