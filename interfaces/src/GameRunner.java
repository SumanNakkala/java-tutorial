public class GameRunner {

    public static void main(String[] args) {

        GamingConsole one = new MarioGame();
    one.switchOn();
     one.down();


     GamingConsole two = new ChessGame();
    two.switchOn();
     two.down();

    }
}
