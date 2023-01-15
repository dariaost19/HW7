package Homework7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an item you would like to buy");
    String item = scan.nextLine();
        System.out.println("Please enter the price of this item");
    int itemPrice = scan.nextInt();

    int payment;
    int balance = 0;
        do {

        System.out.println("Please enter the amount of money you can pay right now");
        payment = scan.nextInt();
        balance = balance+payment;
        if (balance<itemPrice) {
            System.out.println("You still owe " + (itemPrice - balance) + " $");
        }else if(payment>itemPrice){

            System.out.println("Your change is " + (payment - itemPrice) + " $");
        } else{
            System.out.println("You paid in full");
            break;
        }


    }while (payment <itemPrice);
        ++payment;

        System.out.println("Thank you for shopping with us !!!");
        scan.close();
}
    }


