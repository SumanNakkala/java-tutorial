public class ReciepeWithOven  extends Reciepe{
    @Override
    public void getRawmaterials() {
        System.out.println(" Get RAW Material");
    }

    @Override
    public void preprareDish() {

        System.out.println(" Switch on the Oven");
        System.out.println(" Prepare teh DISH");
        System.out.printf("Switch of the Oven");

    }

    @Override
    public void cleanup() {
        System.out.println(" Clean up kitchen");
    }
}
