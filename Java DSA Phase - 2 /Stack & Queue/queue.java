import java.util.Queue;
import java.util.LinkedList;
public class queue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("Australia");
        q.offer("New Zealand");
        q.offer("USA");

        System.out.println(q.peek());

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.size());
        System.out.println(q.peek());
        q.offer("Cananda");
        q.offer("Brazil");
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.remove());

    }
}
