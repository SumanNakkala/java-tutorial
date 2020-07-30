package com.suman.oops;

public class Student {

    String name;
    int marks[];
    int rollnumber;


    public Student(String name , int rollnumber, int... marks ){

        this.name = name;
       this.marks= marks;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }


    public int getTotalmarks (){

        int sum=0;

        for(int mark : this.marks)
        {
            sum= sum+mark;
        }


        return sum;
    }

}
