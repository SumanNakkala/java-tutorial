package com.suman.oops;

public class MotorBike {

    // memeberData

    private int speed ;

    // Methods

    public void increaseSpeed(int speed )
    {
        if(speed>0) {
            this.speed = this.speed + speed;
        }

    }


    public void start(){

        System.out.println(" Bike has started..!!!");
    }

    public int getSpeed()
    {
        return this.speed;
    }

}
