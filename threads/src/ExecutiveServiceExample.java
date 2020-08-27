import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutiveServiceExample {

    public static void main(String[] args) {

        //ExecutorService executorService = Executors.newSingleThreadExecutor();


        ExecutorService executorService = Executors.newFixedThreadPool(2);

       // MyThread t1 = new MyThread();

       // executorService.execute(t1);

        executorService.execute(new MyThread());

        MySecondThread t2 = new MySecondThread();


        Thread task2Thread = new Thread(t2);

        executorService.execute(task2Thread);





        executorService.shutdown();



    }
}
