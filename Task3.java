package Homework7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
    int start= input.nextInt();
        System.out.println("Enter the second number");
    int end= input.nextInt();

    int even=0;
    int odd=0;

        if(start<end) {
        for (int f = start; f <= end; f++) {

            if (f%2==0) {
                even+=f;
            }else{
                odd+=f;
            }
        }
        System.out.println("sum of even numbers is :"+even);
        System.out.println("sum of odd numbers  is :" +odd);
    }else{
        for (int f= start; f >= end; f--) {
            if(f%2==0){
                even+=f;
            }else{
                odd+=f;
            }
        }
        System.out.println("sum of even numbers is :"+even);
        System.out.println("sum of odd numbers is :" +odd);
    }
    }
}
