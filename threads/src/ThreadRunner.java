public class ThreadRunner {


    // 1. Extending the Thread
    // 2 .Implementing the Runnable Interface


    //  States of Threads

    // 1/ NEW

    // RUNNABLE

    // RUNNING

    // BLOCKED/ WAITING

    // TERMINATED



    public static void main(String[] args) throws InterruptedException {


        MyThread t1 = new MyThread();
          //  t1.run();// we should not call RUN
        t1.setPriority(10);

        t1.start(); // to strat a thread

        MySecondThread t2 = new MySecondThread();


        Thread task2Thread = new Thread(t2);

        task2Thread.start();

        // JOIN Method.
        t1.join();
       task2Thread.join();

        System.out.println(" I AM HERE...!!");


        //Task3
        System.out.println(" \n TASK3 STARTED....!!");
        for (int i = 300; i < 400; i++) {

            System.out.print(i + " ");

        }
        System.out.println(" \n   TASK3 ended....!!");

    }
}


