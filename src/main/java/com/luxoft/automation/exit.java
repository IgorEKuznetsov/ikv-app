package com.luxoft.automation;

import java.util.Scanner;

public class exit {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int x = 0, y = 0;

            System.out.print("x = ");
            x = in.nextInt();
            System.out.print("y = ");
            y = in.nextInt();
            if (y == 0) {
                System.out.println("Нельзя делить на 0");
                System.exit(1); // Завершаем выполнение программы
            }
            System.out.println("Результат деления = " + (x / y));

    }
}
