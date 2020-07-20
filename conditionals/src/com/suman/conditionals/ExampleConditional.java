package com.suman.conditionals;

import java.util.Scanner;

public class ExampleConditional {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter a number of your choice ");

        int marks = scanner.nextInt();

        checkformarks(marks);

        // < 36 - fail
        // >=36 < 60 - first class
        // >60 - distinction

        System.out.println(" Please enter a number of your choice ");

        int num1 = scanner.nextInt();

        System.out.println(" Please enter a number of your choice ");

        int num2 = scanner.nextInt();

        int total =add(num1,num2);
        System.out.println(" The sum is "+ total);



    }
 // this method is used to add two numbers
    public static int add(int one, int two) {

        int result = one+two;

        return  result;

    }

    public static int mul(int one, int two) {

        int result = one*two;

        return  result;

    }

    public static void checkformarks(int marks) {

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


    }

}
