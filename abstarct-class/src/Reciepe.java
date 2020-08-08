public  abstract class Reciepe {


    // 1 .Get the raw materials
    // 2. prepare the dish
    // 3. clean the vessels

    public void make(){   // Concrete Method
        
        getRawmaterials();
        preprareDish();
        cleanup();

    }

    public abstract void getRawmaterials(); // abstract Methods

    public abstract void  preprareDish();

    public abstract void cleanup();



}
