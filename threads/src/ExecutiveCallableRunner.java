import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutiveCallableRunner {


    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CallableExample task1 = new CallableExample("phani");
        CallableExample task2 = new CallableExample("Suman");
        //A Future represents the result of an asynchronous computation

        //Submits a value-returning task for execution and returns a Future representing the pending results of the task.
         /*Future<String> value = executorService.submit(task1);
        Future<String> value2 = executorService.submit(task2);*/
         String s = executorService.invokeAny(List.of(task1, task2));
        executorService.invokeAll(List.of(task1, task2));

        System.out.println(s);


        executorService.shutdown();


    }
}
