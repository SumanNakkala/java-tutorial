class MyThread extends  Thread {

    @Override
    public void run() {

        // Task1
        System.out.println("TASK1 STARTED....!!");
        for (int i = 100; i < 200; i++) {

            System.out.print(i + " ");

        }
        System.out.println(" \n TASK1 ended....!!");

    }
}