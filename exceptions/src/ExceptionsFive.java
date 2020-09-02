public class ExceptionsFive {

    public static void main(String[] args) {


        doSomeThing();

    }

    private static void doSomeThing() throws NullPointerException{

        String s =null;
        System.out.println("The length is " + s.length());
    }
}
