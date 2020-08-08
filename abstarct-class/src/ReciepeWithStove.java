public class ReciepeWithStove  extends Reciepe{
    @Override
    public void getRawmaterials() {
        System.out.println(" Get RAW Material");
    }

    @Override
    public void preprareDish() {

        System.out.println(" Switch on the Stove");
        System.out.println(" Prepare teh DISH");
        System.out.printf("Switch of the Stove");

    }

    @Override
    public void cleanup() {
        System.out.println(" Clean up kitchen");
    }
}
