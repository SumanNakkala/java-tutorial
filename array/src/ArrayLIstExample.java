import java.util.ArrayList;

public class ArrayLIstExample {


    public static void main(String[] args) {


        ArrayList myList = new ArrayList();

        myList.add("Suman");
        myList.add("Phani");
        myList.add(44);
        myList.add(87.98f);


        System.out.println("myList"+ myList);


        myList.remove(3);

        System.out.println("myList"+ myList);


        System.out.println("" + myList.get(2));

        ArrayList<String> stringList = new ArrayList(); // Only String will be allowed
        stringList.add("Suman");
        //stringList.add(21);






    }
}
