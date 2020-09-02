public class ExceptionFour {

    public static void main(String[] args) {

        int a =10;
        int b = 2;
        int arr[] ={3,5};

        String s = "suman";


        // try - catch
        // try - catch - finally
        // try - finally


        /*Checked: are the exceptions that are checked at compile time. If some code within a method throws a checked exception,
        then the method must either handle the exception or it must specify the exception using
        throws keyword. ... 2) Unchecked are the exceptions that are not checked at compiled time.*/
        try
        {
            // Code

            System.out.println(a/b);
            System.out.println(s.length());
            System.out.println(arr[0]);

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


        finally {

            System.out.println("I AM here");

        }



    }
}
