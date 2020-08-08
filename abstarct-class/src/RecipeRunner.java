public class RecipeRunner {

    public static void main(String[] args) {


       // Reciepe rOne = new Reciepe()  _ this wont work as it is an abstarct class

        ReciepeWithStove stove = new ReciepeWithStove();

        stove.make();

        ReciepeWithOven oven = new ReciepeWithOven();

        oven.make();


    }
}
