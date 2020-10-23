package com.company;

import java.util.ArrayList;

public class League <T extends Team>  {

    private String name;
    private ArrayList <Team> clasament = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeamToLeague (T teamToAdd){
        if (clasament.contains(teamToAdd)) {
            System.out.println("This team is already in the league: " + teamToAdd.getName());
            return false;
        } else {
            clasament.add(teamToAdd);
            return true;
        }
    }

    public ArrayList<Team> getClasament() {
        return clasament;
    }

}
