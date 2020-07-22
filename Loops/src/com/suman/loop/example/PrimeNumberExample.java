package com.suman.loop.example;

import java.util.Scanner;

public class PrimeNumberExample {

    public static void main(String[] args) {


        //  3
        // 4
        // 5

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter the choice ");

        boolean isPrime = false;

        int c = scanner.nextInt();

        for (int i = 2 ; i< c-1 ;i++)
        {
            System.out.println(" Chevking if number is dviisble by " + i) ;
            if(c%i ==0)
            {

                isPrime = true;
                break; // We want to break the loop so using break
            }
        }

        if(isPrime)
        {
            System.out.println(" NOT a prime");
        }
        else{
            System.out.println("IS A PRIME");
        }

    }
}
