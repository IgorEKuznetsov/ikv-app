package com.luxoft.automation;

import java.util.Scanner;

public class Calculate {
    private int numberOne;
    private int numberTwo;
    private String action;
    Scanner scanner = new Scanner(System.in);


    public void setNumberOne() {
        this.numberOne = scanner.nextInt();
    }

    public void setAction() {
        this.action = scanner.next();

    }

    public String getAction() {
        return action;
    }

    public void setNumberTwo() {
        this.numberTwo = scanner.nextInt();
    }

    public int plus() {
        return numberOne + numberTwo;
    }

    public int minus() {
        return numberTwo - numberTwo;
    }

    public int multip() {
        return numberTwo * numberTwo;
    }

    public int division() {
        if (numberTwo == 0) {
            System.out.println("Деление на 0!!!");
            return 0;
        }
        return numberOne / numberTwo;
    }
    public int factorial(){
      int res = 1;
          for (int i = 1; i <= numberOne; i++) {
              res *= i;
          }

          return res;
  }


}

