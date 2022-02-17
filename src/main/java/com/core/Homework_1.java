/**
 *  Java core. Homework_1
 *
 * @autor Igor Kuznetsov
 * @version 16.02.2022
 */
package com.core;

public class Homework_1 {
    public static void main(String[] args) {
        Course course = new Course();
        Team team = new Team("Winners never quit");
        System.out.println(team);
        team.showResults(course);
    }
}
