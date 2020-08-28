import java.util.concurrent.Callable;

public class CallableExample implements Callable<String> {

    public String name;

    public CallableExample(String name ){
        this.name= name;

    }


    @Override
    public String call() throws Exception {
        Thread.sleep(5000);

        return "Hello" + name;
    }
}
