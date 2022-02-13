package com.company;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0); //.trim()->remove all the extra spaces that are end of these words
                                  //charAt(0)->give character at that particular index. here 0 is 1st index
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        } else{
            System.out.println("Uppercase");
        }
    }
}
