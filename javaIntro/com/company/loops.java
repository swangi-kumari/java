package com.company;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            Syntax of for loop:
            for(initialisation; condition; increment/decrement){
            //body
            }
         */

        // Q1.Print nos. from 1 to 5
//        for (int num = 1; num <=5; num += 1 ) {
//            System.out.println(num);
//        }


        //Q2. Print no. from 1 to n
//        System.out.print("enter n: ");
//        int n = in.nextInt();
//        for(int num = 1; num <= n; num ++){
//
//            System.out.println(num + " ");   //print all no. from 1 to n
//            System.out.println("hello Swangi");
//        }

        //while loop
        /*
        Syntax:
        while (condition){
        //body
        }
         */

//        int num = 1;
//        while (num <= 5){
//            System.out.println(num);
//            num += 1;
//        }

        //do while loop    (it executes at least 1 time )
        /*
           do{
           } while (condition):
         */

        int n =1;
        do{
            System.out.println(n);
            n++;
        } while (n<=5);   //print 1 to  5

    }
}
