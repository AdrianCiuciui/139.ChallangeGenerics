package com.company;

public abstract class Team  implements Comparable <Team> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    int points = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int ranking () {
        return won *  3 + tied;
    }

    public int getPoints() {
        return this.won * 3 + this.tied;
    }

    public void matchResult (Team opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore < theirScore) {
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }
        played++;
        if (opponent != null) {
            System.out.printf("%15s %12s %-15s %n",this.getName(), message, opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    @Override
    public int compareTo(Team team) {
        return Integer.compare(this.ranking(), team.ranking());
    }
}