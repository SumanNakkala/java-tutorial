import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        return Integer.compare(t1.length(),s.length());
    }
}

public class QueueExample {

    public static void main(String[] args) {

        StringComparator mystrcomp = new StringComparator();
        Queue<String> queue = new PriorityQueue<>(mystrcomp);

        queue.add("Apple");
        queue.addAll(List.of("Zebra","Horses","Cat"));;
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

    }
}
