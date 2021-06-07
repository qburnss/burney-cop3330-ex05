/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.util.Scanner;

import static java.lang.Integer.*;

public class SimpleMath {
    public static void main(String[] args){
        int add=0;
        int multi=0;
        int sub=0;
        int divi=0;
        System.out.println("What is the first number");
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.next();
        System.out.println("What is the second number");
        Scanner scanner1 = new Scanner(System.in);
        String secondNumber = scanner1.next();
        int n1, n2;
            n1 = parseInt(firstNumber);
            n2 = parseInt(secondNumber);

       /* n1 = Integer.parseInt(firstNumber);
        n2 = Integer.parseInt(secondNumber); */
        add = n1 + n2;

        sub = n1 - n2;

        multi = n1 * n2 ;

        divi = n1 / n2  ;

        System.out.println(n1 + " + " + n2 + " = " + add + "\n"+
                n1 + " - " + n2 + " = " + sub +"\n"+
                n1 + " * " + n2 + " = " + multi +"\n"+
                n1 + " / " + n2 + " = " + divi);

    }
}
