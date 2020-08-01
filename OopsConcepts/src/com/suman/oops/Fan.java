package com.suman.oops;

public class Fan {

    private String make ;
    private int radius;
    private String color;
    private boolean isOn;
    private int speed;

    public Fan()  // this is called default constructor
    {

    }

    public Fan(String make, int radius, String color)
    {
        this.make=make;
        this.radius=radius;
        this.color=color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public  void switchOn(){

        this.isOn = true;
        this.speed =5;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "make='" + make + '\'' +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                ", speed=" + speed +
                '}';
    }

    public void changeSpeed(int i) {

        if(this.isOn)
            this.speed=i;
        else{

            this.isOn=true;
            this.speed=i;
        }
    }

    public void switchOff() {

        this.isOn =false;
        this.speed=0;
    }
}
