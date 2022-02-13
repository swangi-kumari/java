package com.company;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        

        //Q. Find the largest of the three no  (method 1)
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }

        //(method 2)
//        int max = 0;
//        if(a> b){
//            max = b;
//        } else {
//            max = b;
//        }
//        if (c>max){
//            max =c;
//        }

        //(method 3)
        int max = Math.max(c,Math.max(a, b));
        System.out.println(max);
    }
}
