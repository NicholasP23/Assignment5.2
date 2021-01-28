package com.github.nicholasp23.assignment5_2;
/*
 Complete these classes and follow the rubric for full credit.
 */
public class Driver {

    public static void main(String[] args) {

        Player goalie1 = new Player("Mike", 3); // goalie for first team
        Player goalie2 = new Player("John", 4); // goalie for second team

        Player[] decentTeam = {new Player("Nick",0),
                new Player("Michael",1),
                new Player("Riko",3),
                new Player("Tiko",4),
                new Player("Miko",5)
        }; // kickers

        Player[] insaneTeam = {new Player("Nate",3),
                new Player("Mikael",4),
                new Player("Chiko",5),
                new Player("Mex",6),
                new Player("Rex",9)
        }; // kickers

        PenaltyShootout decentTeamGoalie = new PenaltyShootout(goalie1);
        PenaltyShootout insaneTeamGoalie = new PenaltyShootout(goalie2);

        // looping through the first team and seeing
        // if each player can make a goal
        System.out.println("First Team:");
        for(Player player: decentTeam){
            System.out.println(player.toString());
            insaneTeamGoalie.kick(player);
        }

        //Displaying the insane team goalie results
        System.out.println("\nThe Defending Goalie (" + goalie2.getName() + ") Stats:\n" + insaneTeamGoalie.toString());

        //Making the transition from first game and second game
        //a little bit more readable
        System.out.println("\n--------------------------------" +
                "\n--------------------------------");

        // looping through the second team and seeing
        // if each player can make a goal
        System.out.println("\nSecond Team:");
        for(Player player: insaneTeam){
            System.out.println(player.toString());
            decentTeamGoalie.kick(player);
        }

        //Displaying the decent team goalie results
        System.out.println("\nThe Defending Goalie (" + goalie1.getName() + ") Stats:\n" + decentTeamGoalie.toString());
    }
}
