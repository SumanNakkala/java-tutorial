package com.suman.conditionals;

import java.util.Scanner;

public class ExampleConditional {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter a number of your choice ");

        int marks = scanner.nextInt();

        // < 36 - fail
        // >=36 < 60 - first class
        // >60 - distinction

        if (marks <  36)
        {
            System.out.println("STUDENT HAS FAILED");
        }
        else if ( marks >=36 && marks < 60){
            System.out.println("STUDENT HAS PASSED in FIRST CLASS");

        }
        else if (marks>=60 ){

            System.out.println("STUDENT HAS PASSED in  DISTINCTION");
        }


        // Take 2 input numbers
        // Take an operation as input ,  add , sub , mul









    }

}
