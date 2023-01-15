package Homework7;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        /*
        Create a program that will be asking user to apply for a credit card 10 times.
         As soon you get an “yes” from a user program should stop asking.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you need credit card?");

        for(int  i=0; i <= 10; i++){

            String answer= scan.next();

                if(answer.equalsIgnoreCase("no")){
               System.out.println("apply for credit card");
               continue;
           }else {
               System.out.println("stop");
               break;
           }


        }
    }
}
