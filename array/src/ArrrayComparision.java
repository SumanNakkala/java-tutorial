import java.util.Arrays;

public class ArrrayComparision {

    public static void main(String[] args) {


        int a[] = {1,2,3,4};
        int b[] = {1,2,3};


        // To compare two arrays
        System.out.println(Arrays.equals(a,b));

        System.out.println(a);

        // To print the contents of teh Array
        System.out.println(Arrays.toString(a));

        int marks[] = { 78, 56, 87, 65};

        System.out.println("BEFORE SORTING " + Arrays.toString(marks));

        // To sort the array
        Arrays.sort(marks);

        System.out.println("AFTER SORTING " + Arrays.toString(marks));

        // HOME WORK

       // String days [] = {"sunday", "monday"}

        //  OUTPUT - print the day with more charecters







    }
}
