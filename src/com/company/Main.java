package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//         Create a generic class to implement a league table for a sport.
//         The class should allow teams to be added to the list, and store
//         a list of teams that belong to the league.
//
//         Your class should have a method to print out the teams in order,
//         with the team at the top of the league printed first.
//
//         Only teams of the same type should be added to any particular
//         instance of the league class - the program should fail to compile
//         if an attempt is made to add an incompatible team.



        League <Fotbal> ligaDeFotbal = new League<>("Liga 1 de Fotbal");
        Fotbal uCluj = new Fotbal("U Cluj");
        Fotbal cfr = new Fotbal("CFR");
        Fotbal steaua = new Fotbal("Steaua");
        Fotbal dinamo = new Fotbal("Dinamo");
        ligaDeFotbal.addTeamToLeague(uCluj);
        ligaDeFotbal.addTeamToLeague(uCluj);
        ligaDeFotbal.addTeamToLeague(uCluj);
        ligaDeFotbal.addTeamToLeague(cfr);
        ligaDeFotbal.addTeamToLeague(steaua);
        ligaDeFotbal.addTeamToLeague(dinamo);

        //matches
        uCluj.matchResult(cfr, 3, 0);
        uCluj.matchResult(steaua, 3, 0);
        uCluj.matchResult(dinamo, 2, 2);
        cfr.matchResult(steaua, 2, 2);
        cfr.matchResult(dinamo, 2, 2);
        steaua.matchResult(dinamo,3,2);

        ligaDeFotbal.showLeagueTable();

        System.out.println("\n ================== \n");
        // Baschet zone
        League <Baschet> ligaDeBaschet = new League<>("Liga 1 de Baschet");
        Baschet mobitelco = new Baschet("A Mobitelco");
        Baschet fortaSibiu = new Baschet("B Forta Sibiu");
        Baschet putereaOradea = new Baschet("C Puterea Oradea");
        Baschet superIasi = new Baschet("D Super Iasi");
        ligaDeBaschet.addTeamToLeague(mobitelco);
        ligaDeBaschet.addTeamToLeague(fortaSibiu);
        ligaDeBaschet.addTeamToLeague(putereaOradea);
        ligaDeBaschet.addTeamToLeague(superIasi);

        //matches
        mobitelco.matchResult(fortaSibiu, 102, 99);
        fortaSibiu.matchResult(putereaOradea, 80, 99);
        putereaOradea.matchResult(superIasi, 66, 112);
        putereaOradea.matchResult(fortaSibiu, 77, 76);
        superIasi.matchResult(mobitelco, 112, 70);
        superIasi.matchResult(putereaOradea, 112, 70);

        ligaDeBaschet.showLeagueTable();
        }
}
