import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

 // Our Own predicte
class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        return (number % 2 ==0);
    }
}
class PrintEachConsumer implements Consumer<Integer>{

    @Override
    public void accept(Integer integer) {
        System.out.print(integer);

    }
}
class SquareFunction implements Function<Integer,Integer> {

    @Override
    public Integer apply(Integer n) {
        return n *n;
    }
}

public class FBInDepth {


    public static void myPrint( Integer n){
        System.out.println(n);
    }

    public static void main(String[] args) {

         Predicate<Integer> integerPredicate = i -> i % 2 == 0;
        List.of(34,36,38,41 , 43, 55).stream()
            .filter(integerPredicate).
                map( n -> n *n)
            .forEach(FBInDepth::myPrint);




    EvenNumberPredicate myPredicate = new EvenNumberPredicate();
        PrintEachConsumer printEachConsumer = new PrintEachConsumer();

        SquareFunction squareFunction = new SquareFunction();
        List.of(34,36,38,41 , 43, 55).stream()
                .filter(myPredicate)
        .map( squareFunction)
                .forEach(printEachConsumer);

    /*
    * Stream<T> filter(Predicate<? super T> predicate)
Returns a stream consisting of the elements of this stream that match the given predicate.
This is an intermediate operation.
    *  */


        /*void forEach(Consumer<? super T> action)
Performs an action for each element of this stream.
This is a terminal operation.
        *
        * */


        /*

        <R> Stream<R> map(Function<? super T,​? extends R> mapper)
Returns a stream consisting of the results of applying the given function to the elements of this stream.
This is an intermediate operation.
         */












    }
}
