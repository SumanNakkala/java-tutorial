package com.suman.oops;

public class StudentRunner {


    public static void main(String[] args) {



        Student suman = new Student("suman", 67,89);

        Student phani = new Student("phani", 98,76 , 98);

        Student xyz = new Student("xyz", 98,76 , 98,78,98,100);




        System.out.println(suman.getTotalmarks());

        System.out.println(phani.getTotalmarks());


    }
}
