package com.suman.conditionals;

import java.util.Scanner;

public class StringCompar {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println(" Please enter your Name ");

        String name = sc.next();

        if("Suman".equalsIgnoreCase(name))
        {
            System.out.println(" You r right ");
        }
        else{

            System.out.println(" YOu are wrong");
        }


    }
}
