package com.expresslab.games;

public class Basketball extends Team{
    private String name = "basketball";
    private int score = 43;

    public Basketball(String name, int thirdScore) {
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
