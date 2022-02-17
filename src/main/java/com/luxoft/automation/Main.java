package com.luxoft.automation;


public class Main {
    public static void main(String[] args) {
        String userInput = "";
        double result;
        Calculate calc = new Calculate();

        while (!"q".equals(userInput)) {
            System.out.println("введите числа и действие: + - * / !");
            System.out.println("Числа разделяются пробелом или клавишей \"Enter\"");
            calc.setNumberOne();
            calc.setAction();
            userInput = calc.getAction();
            if (!"!".equals(userInput)) {
                   calc.setNumberTwo();
              }

            switch (userInput) {
                case "+": result = calc.plus();
                    break;
                case "-": result = calc.minus();
                    break;
                case "*": result = calc.multip();
                    break;
                case "/": result = calc.division();
                    break;
                  case "!": result = calc.factorial();
                      break;
                default: result = 0;
                    break;
            }
            System.out.println("Результат: " + result);
            System.out.println();
        }
    }


}
