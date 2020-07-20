package com.suman.conditionals;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();


        switch( choice )  {

            case  1 :
                System.out.println("hello");
                break;
            case  2 :
                System.out.println("World");
                break;

            default:
                System.out.println(" Please enter an valid choice ( please enter 1 or 2) ");


        }




    }
}
