public class SampleArrayTester {

    public static void main(String[] args) {

        int marks[] = {67,76,89,67,98,66};
        int sum =0;
    // this is for loop
        for (int i = 0; i < marks.length; i++) {


            sum = sum + marks[i];

        }
        // for each loop
        int sum1=0;
        // for ech can be used only on Arrays or collections
        for(int val : marks){

            sum1 = sum1 + val;

        }



        System.out.println(sum);
        System.out.println(sum1);




    }
}
