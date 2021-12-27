package com.expresslab.games;

public class Paintball extends Team{
    private String name = "paintball";
    private int score = 50;

    public Paintball(String name, int score) {
        super(name, score);
    }
    public Paintball() {
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
