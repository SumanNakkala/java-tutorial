package com.suman.oops;

public class FanTester {

    public static void main(String[] args) {

        Fan myFan = new Fan(); //  Even if default constructor is not written , compiler will take care of it.an


        Fan fanOne = new Fan("cromton",5,"green");

        System.out.println("The Fan is " + fanOne.toString());

        fanOne.switchOn();

        System.out.println("The Fan is " + fanOne.toString());

        fanOne.changeSpeed(3);

        System.out.println("The Fan is " + fanOne.toString());

        fanOne.switchOff();


        System.out.println("The Fan is " + fanOne.toString());

        fanOne.changeSpeed(4);

        System.out.println("The Fan is " + fanOne.toString());





    }
}
