package com.suman.loop.example;

public class PrimeNumberTester {

    public static void main(String[] args) {

        MyNumber number = new MyNumber(2);

        number.setNumber(7);

        System.out.println("The Number is " +number.getNumber());


        System.out.println("The result is " + number.checkForPrime());
    }
}
