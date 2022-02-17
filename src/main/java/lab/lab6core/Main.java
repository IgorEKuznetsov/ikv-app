package lab.lab6core;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] massOfProducts = new String[5];
        Integer[] massOfCost = new Integer[5];


        for(int i = 0; i < 5; i++){
            String userInput = sc.nextLine();
            if(userInput.equals("exit")){
                System.out.println("Goodbye!");
                break;
            }
            else {
                try {
                    int cost = Integer.parseInt(userInput.split(" ")[1]);
                    massOfCost[i] = cost;
                    String name = userInput.split(" ")[0];
                    massOfProducts[i] = name;
                }
                catch (NumberFormatException ex){
                    System.out.println(ex.getMessage());
                    System.out.println("Retry!");
                    continue;
                }


            }
       }



        System.out.println(Arrays.toString(massOfProducts));
        System.out.println(Arrays.toString(massOfCost));


    }
}
