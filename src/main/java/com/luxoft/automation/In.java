package com.luxoft.automation;
import java.util.Scanner;
public class In {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        System.out.print("x = ");
        x = in.nextInt();
        System.out.print("y = ");
        y = in.nextInt();
        System.out.println("Сумма = " + (x + y));
        if((x + y)%2 == 0) {
            System.out.println("Четное");
        }
        else System.out.println("Нечетное");
    }

}
