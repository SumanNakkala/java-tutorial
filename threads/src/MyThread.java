class MyThread extends  Thread {

    int value;

    public MyThread(int i){
        value=i;

    }

    @Override
    public void run() {



        // Task1
        System.out.println("TASK ....!!" + this.value + "STARTED") ;
        for (int i = value*100; i < value*100+99; i++) {

            System.out.print(i + " ");


        }
        //A hint to the scheduler that the current thread is willing to yield its current use of a processor.
        // The scheduler is free to ignore this hint.
        //Thread.yield();
        System.out.println("\n TASK ....!!" + this.value + "ENDED") ;

    }
}