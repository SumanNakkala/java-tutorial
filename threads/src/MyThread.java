class MyThread extends  Thread {

    @Override
    public void run() {



        // Task1
        System.out.println("TASK1 STARTED....!!");
        for (int i = 100; i < 200; i++) {

            System.out.print(i + " ");

            if(i==150){
                try {

                    //Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds,
                    // subject to the precision and accuracy of system timers and schedulers.
                    System.out.println("I AM SLEEPY NOW");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        //A hint to the scheduler that the current thread is willing to yield its current use of a processor.
        // The scheduler is free to ignore this hint.
        //Thread.yield();
        System.out.println(" \n TASK1 ended....!!");

    }
}