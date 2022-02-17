package com.lessons;

public class Practise {
    static char[][] map;
    final static int SIZE = 3;
    final static char EMPTY = '*';

    public static void main(String[] args) {
        initTable();
        printTable();
    }

    static void initTable() {
        map = new char[SIZE][SIZE];
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if((x + y) % 2 == 0) {map[x][y] = 'X';}
                else map[x][y] = EMPTY;
            }
        }
    }

    static void printTable() {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                System.out.print(map[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
