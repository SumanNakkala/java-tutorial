//import static java.lang.Thread.*;

//import static java.lang.Thread.sleep;

public class ExceptionsFour {

    public static void main(String[] args) {

        //Unhandled exception: java.lang.InterruptedException
        try {
            Thread.sleep(5000);

            doSomething();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void doSomething() throws InterruptedException{

    //Unhandled exception: java.lang.InterruptedExceptio
        Thread.sleep(5000);
    }
}
