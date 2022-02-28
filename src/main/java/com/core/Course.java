package com.core;

import java.util.Arrays;

public class Course {
    protected int[] obstructions;

    public Course() {
        obstructions = new int[]{1, 2, 5, 10, 17, 20, 22, 25, 30, 35};
    }

    @Override
    public String toString() {
        return Arrays.toString(obstructions);
    }

    public boolean doIt(Team.Player player) {
        return player.getMax_distance() >= obstructions[obstructions.length-1];
    }

}
