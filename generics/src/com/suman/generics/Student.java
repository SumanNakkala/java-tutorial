package com.suman.generics;

import java.util.ArrayList;

public class Student<T> {

   public ArrayList<T> marks = new ArrayList<>();


   public void addmarks(T subjectMarks){

       marks.add(subjectMarks);
   }

   public void removeMarks(int index){

       marks.remove(index);
   }

   public T getmarks(int index){

       return marks.get(index);
   }



    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                '}';
    }
}
