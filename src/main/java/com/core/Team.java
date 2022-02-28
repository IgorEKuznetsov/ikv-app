package com.core;

import java.util.Arrays;

public class Team {
    private String teamName;
    private Player[] players;
    private String className;

    class Player {
        private String playerName;
        private int max_distance;

        public Player(String playerName, int max_distance) {
            this.playerName = playerName;
            this.max_distance = max_distance;
        }

        public int getMax_distance() {
            return max_distance;
        }

        @Override
        public String toString() {
            return "playerName: " + playerName + ", " + "max_distance: " + max_distance;
        }

    }

    public Team(String teamName) {
        this.teamName = teamName;
        players = new Player[]{new Player("Mark", 7),
                new Player("Bob", 40),
                new Player("Karl", 30),
                new Player("David", 3)};

        className = getClass().getSimpleName();
    }


    @Override
    public String toString() {
        return className + " " + teamName + ": " + "\n"
                + Arrays.toString(players);
    }


    public void showResults(Course course) {
        for (Player player : players) {
            if (course.doIt(player)) System.out.println("Congratulations! " + player.playerName);
            else System.out.println(player.playerName + " couldn't run the distance");
        }
    }


}

