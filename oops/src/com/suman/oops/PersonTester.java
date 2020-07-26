package com.suman.oops;

public class PersonTester {

    public static void main(String[] args) {


/*
        Person phani = new Person("Vijayawada");

        phani.setLocation("USA");

        System.out.println(phani.getLocation());
*/

        int i =5;

        int j ;

        j=i;

        j =10;

        System.out.println("The value of j "+ j);
        System.out.println(" Yhe value of i " + i);

        Person phani =  new Person();

        phani.setLocation("VJA");

        System.out.println("The location of phani " + phani.getLocation());

        System.out.println(phani);

        Person suman = new Person();

        suman.setLocation("HYD");

        System.out.println(suman);

        Person xyz = null;

        Person  krishna ;

        krishna = phani;

        krishna.setLocation("USA");

        System.out.println(krishna);

        System.out.println(" The location of krishna is " + krishna.getLocation());


        System.out.println("The location of phani is " + phani.getLocation());

        System.out.println("The location is " + suman.getLocation());

        int variableOne = 17;

        int variableTwo = 17;

        if(variableOne==variableTwo){
            System.out.println("Two numbers are equal");
        }

        Person P1 = new Person("VJY");

        System.out.println(P1);

        Person P2 = new Person("VJY");

        System.out.println(P2);

        if(P1==P2){

            System.out.println("EQUAL");
        }




    }
}
