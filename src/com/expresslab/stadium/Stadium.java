package com.expresslab.stadium;

import com.expresslab.games.Single;
import com.expresslab.games.Team;

import java.util.ArrayList;
import java.util.List;

public class Stadium {
    private  IChempionship chempionship;
    private String year;
    private List <Team> listTeam;
    private List <Single> listSingle;
    private String name;

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
    public void setSingle(Single single) {

        this.listSingle.add(single);
    }

    public List<Single> getListSingle() {
        return this.listSingle;
    }

    public void setTeam(Team team) {

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
    public void printListNameGamesTeam() {
        for(Team team : this.getListTeam()) {
            System.out.println(team.getName());
        }
    }

    public void printListNameGamesSingle() {
        for(Single single : this.getListSingle()) {
            System.out.println(single.getName());
        }
    }
}
