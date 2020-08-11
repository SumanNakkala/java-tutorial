public interface GamingConsole {

    public int price = 1200;

    public void up();
    public void down();


    public default void switchOn(){  // this is possible only from Java 8

        System.out.println("SWiych on the power button");
    }

}
