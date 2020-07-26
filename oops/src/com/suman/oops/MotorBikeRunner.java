package com.suman.oops;

public class MotorBikeRunner {

    public static void main(String[] args) {


        MotorBike honda = new MotorBike();

        MotorBike ducati = new MotorBike();

            honda.start();
            ducati.start();

            //honda.speed = 100;
            honda.increaseSpeed(100);
            ducati.increaseSpeed(80);
            honda.increaseSpeed(60);

          honda.increaseSpeed(-110);


        // encapsulation

        // Abstraction - hiding the internal details.


        System.out.println(" The Speed of honda is " + honda.getSpeed());

        System.out.println(" The Speed of ducati is " + ducati.getSpeed());


    }
}
