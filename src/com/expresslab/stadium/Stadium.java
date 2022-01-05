package com.expresslab.stadium;

import java.util.ArrayList;
import java.util.List;

public class Stadium<Single, Team> {
    private  IChempionship chempionship;
    private String year;
    private List <Team> listTeam;
    private List <Single> listSingle;
    private String name;


    public Stadium(){
    }

    public Stadium(String year){
        this.year = year;
    }

    public String getYear(){
        return this.year;
    }
    public Stadium() {
        listTeam = new ArrayList<Team>();
        listSingle = new ArrayList<Single>();
    }

    public Stadium(String name) {
        this.name = name;
        listSingle = new ArrayList<Single>();
        listTeam = new ArrayList<Team>();
    }
    public void setSingle(Single Single) {
        Single single;
        this.listSingle.add(single);
    }

    public List<Single> getListSingle() {
        return this.listSingle;
    }

    public void setTeam(Team team) {
        Team team;
        this.listTeam.add(team);
    }

    public List<Team> getListTeam() {
        return this.listTeam;
    }







    public void setChampionship(IChempionship chempionship){
        this.chempionship = chempionship;
    }
    public IChempionship getChempionship(){
        return this.chempionship;
    }
    public void printListNameGames() {
        for(Team team : this.getListTeam()) {
            System.out.println(team.getName());
        }
    }
}
