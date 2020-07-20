package com.suman.conditionals;

public class MethodIntro {

    public static void main(String[] args) {
    int param = 5;
        sayHello(param); // Method call

    }

    public static void sayHello (int a){

        System.out.println(" Say Hello ...!!" + a);

        int myparam = 7;
        sayBolo(myparam);
    }
 // Method signature
    public static void sayBolo(){

        System.out.println(" Bolo...!! " );
    }

    public static void sayBolo(int b){

        System.out.println(" Bolo...!! " + b);
    }

    public static void sayBolo(int a , int b){

        System.out.println(" Bolo...!! " + (a+b));
    }



}


