package com.expresslab.games;

public class Golf extends Single {
    private String name = "Golf";
    private int score = 222;

    public Golf(String name, int score) {

        super(name,score);
    }
    public Golf(String a_game_with_a_ball) {
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
