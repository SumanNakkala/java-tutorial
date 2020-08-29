public class ExceptionsTwo {
    public static void main(String[] args) {

        /*
        java.lang.Object
        java.lang.Throwable
        java.lang.Exception
        java.lang.RuntimeException
        java.lang.ArithmeticException
        *
        * */

        /*
        * java.lang.Object
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException
*
*/

        try {

            divideNumbers(10, 0);
            String myString= null;
            System.out.println("The length of the MY STRING IS " + myString.length());
        }
        catch(NullPointerException | ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println(" PROCESS HAS ENDED");

    }

    private static void divideNumbers(int a, int b) {

        /*
        * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionBasics.divideNumbers(ExceptionBasics.java:20)
	at ExceptionBasics.main(ExceptionBasics.java:13)*/



            System.out.println("The Result is " + a / b);


    }
}


