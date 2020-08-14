import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLIstExample {


    public static void main(String[] args) {


        List<String> animals = new ArrayList<>();
        animals.add("tiger");
        animals.add("cat");
        animals.add("rat");

        /*for(int i =0 ;i<animals.size();i++){

            System.out.println(animals.get(i));
        }*/

        for (String animal : animals){

            if(animal.endsWith("at"))
            {
                animals.remove(animal);
            }

        }

        System.out.println(animals);

        Iterator<String> animalIterator = animals.iterator();

        while(animalIterator.hasNext()){

            //System.out.println(animalIterator.next());

            if(animalIterator.next().endsWith("at"))
            {
                animalIterator.remove();
            }

        }

        System.out.println(animals);


    }
}
