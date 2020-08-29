public class ExceptionBasics {

    public static void main(String[] args) {

        int a =10;
        int b = 0;

        /*
        * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionBasics.main(ExceptionBasics.java:8)
*/
        try {
            System.out.println("The Result is " + a / b);

            String myString= null;
            System.out.println("The length of the MY STRING IS " + myString.length());
        }
        catch(Exception sewaeg ){
            sewaeg.printStackTrace();

        }

        System.out.println(" THE PROCESS HAS ENDED..!!");

    }

    private static void divideNumbers(int a, int b) {

        /*
        * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionBasics.divideNumbers(ExceptionBasics.java:20)
	at ExceptionBasics.main(ExceptionBasics.java:13)*/

        System.out.println("The Result is " + a/b);
    }
}
