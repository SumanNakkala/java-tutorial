package com.suman.loop.example;

import java.util.Scanner;

public class SumToN {

    public static void main(String[] args) {

        // sum to N numbers
        // input 5 ,  5+4+3+2+1 = 15

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter a number of your choice");
        int choice = scanner.nextInt();
        int result =0;

        for ( int i = choice ; i >=1 ; i--)
        {
            System.out.println(" THe current value of i ==" +i);
            result = result + i;
            System.out.println(" The current value of result is " + result );
        }
        System.out.println("  The result is " + result);

    }
}
