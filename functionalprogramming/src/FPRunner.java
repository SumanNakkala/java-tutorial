import java.util.List;

public class FPRunner {

    public static void main(String[] args) {


        List<String> animals = List.of("Lion", "Tiger", "Rat","Cat");

        //printValues(animals);
       // printValuesWithFP(animals);

        List<Integer> numbers = List.of(6,8,9,10,11,12,7,3,10,65);

   numbers.stream().distinct().sorted().forEach(number -> System.out.println(number));

        //printNumbersFP(numbers);
        //sumofVlues(numbers);
        //umnofValuesFP(numbers);




    }

    private static void sumnofValuesFP(List<Integer> numbers) {

       int sum = numbers.stream().

               filter(number -> number%2==1)
                .reduce(0, (number1,number2) ->
                        {
                        return number1+number2;
                        })

               ;

        System.out.println(sum);
    }

    private static void sumofVlues(List<Integer> numbers) {

        int sum =0;

        for ( Integer number : numbers ) {
            sum = sum + number;
        }

        System.out.println(sum);
    }

    private static void printNumbersFP(List<Integer> numbers) {

        numbers.stream()
                .filter(number -> number%2==1)
                .forEach(number -> System.out.println(number));


    }

    private static void printValuesWithFP(List<String> animals) {
        // LAMDA expresssions

        animals.stream()
                .filter(animal -> animal.endsWith("at"))

                .forEach(animal ->   System.out.println(animal)   );
    }

    public static void printValues(List<String> animals) {
        for( String animal : animals)     {

            if(animal.endsWith("at"))

                System.out.println(animal);
        }
    }


}
