

import java.util.ArrayList;

public class StudentRunner {

    public static void main(String[] args) {

        int marks[] = {45,56,78};
        Student ram = new Student("RAM", marks);

        int marks1[] = {76,98,34,56};

        Student rani = new Student("Rani", marks1);


        System.out.println(ram);

        // total marks

        System.out.println(" The total number of marksk " + ram.getNumberOfNumbers());
        System.out.println(" The total number of marksk " + rani.getNumberOfNumbers());
        // sum of marks
        System.out.println(" Teh Sum of marks " + ram.getTotalmarks());
        System.out.println(" Teh Sum of marks " + rani.getTotalmarks());
        // maximjum marks

        System.out.printf("The highest marks for Ram is " + ram.getMaximumMarks());

        System.out.println("The highest marks for Rani is " + rani.getMaximumMarks());


        // minimum marks;


        /******** ARRAYLIST********************/
        ArrayList<Integer> marks2=  new ArrayList();
        marks2.add(54);
        marks2.add(96);
        marks2.add(78);



        MyStudent student1 = new MyStudent("phani" , marks2 );

        System.out.println("MAximum when used with ArrayList "+ student1.getMaximummarks());


        student1.addmarks(99);

        System.out.println("MAximum when used with ArrayList "+ student1.getMaximummarks());




    }
}
