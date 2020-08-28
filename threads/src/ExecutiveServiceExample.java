import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutiveServiceExample {

    public static void main(String[] args) {

        //ExecutorService executorService = Executors.newSingleThreadExecutor();


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new MyThread(1));
        executorService.execute(new MyThread(2));
        executorService.execute(new MyThread(3));
        executorService.execute(new MyThread(4));






        executorService.shutdown();



    }
}
