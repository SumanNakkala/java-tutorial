public class ExceptionThree {


    public static void main(String[] args) {


        int a =10;
        int b = 2;
        int arr[] ={3,5};

        String s = "suman";

        try {
            System.out.println(a/b);
            System.out.println(s.length());
            System.out.println(arr[3]);
        }


        catch(NullPointerException e){
            e.printStackTrace();
        }
        catch (ArithmeticException ex){
            ex.printStackTrace();
        }
        catch (Exception e ){ // This should be always at the last
            e.printStackTrace();
        }


        /*catch(Exception e){
            e.printStackTrace();
        }*/



        System.out.println(" MAIN PROGRAM EndEd...!!!");
    }
}
