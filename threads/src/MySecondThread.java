class MySecondThread implements  Runnable {

    @Override
    public void run() {

        // Task 2

        System.out.println("\n TASK2 STARTED....!!");
        for (int i = 200; i < 300; i++) {

            System.out.print(i + " ");

        }
        System.out.println(" \n TASK2 ended....!!");

    }
}