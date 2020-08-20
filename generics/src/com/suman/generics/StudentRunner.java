package com.suman.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRunner {


      static <X>  X doubleValue( X value) {

          return value;
      }

    static <X extends List>  X processList(X value) {

        return value;
    }


    static double sumofListElements(List<? extends Number>  marks){

        double sum = 0;

        for (Number i : marks){
            sum = sum+i.doubleValue();
        }
          return sum;
    }



    public static void main(String[] args) {


        System.out.println(sumofListElements(List.of(5,8,9,10)));

        System.out.println(sumofListElements(List.of(5.9,8.9,9.6,10.3)));

        System.out.println(sumofListElements(List.of(7l,9l,6l,2l)));

       // System.out.println(sumofListElements(List.of("suman","phani")));



         String s = doubleValue(new String());
         Integer integer = doubleValue(Integer.valueOf(5));
         Double aDouble = doubleValue(Double.valueOf(89.8));
         ArrayList<Object> objects = doubleValue(new ArrayList<>());


         processList(new ArrayList<String>());

         processList(new LinkedList<Integer>());



        Student<Integer> phani = new Student();

        phani.addmarks(Integer.valueOf(99));

        phani.addmarks(Integer.valueOf(88));

        System.out.println(phani.marks);

        System.out.println(phani.getmarks(0));

        Student<Double> suman = new Student();

        suman.addmarks(Double.valueOf(88.9));
        suman.addmarks(Double.valueOf(78.9));
        System.out.println(suman.marks);
        System.out.println(suman.getmarks(0));

        Student<String> hari = new Student();
        hari.addmarks("eightyeight");
        hari.addmarks("seventyseven");



    }
}
