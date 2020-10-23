package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public void showLeagueTable() {
        this.clasament.sort(Comparator.comparing(Team::getPoints));
        Collections.reverse(clasament);

        System.out.println(this.name);
        for (Team team : clasament) {
            System.out.printf("%-20s %3s %n", team.getName(), team.getPoints());
        }



    }
}
