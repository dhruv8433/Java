package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuildExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(6);
        queue.add(97);
        queue.add(45); 
        queue.add(49);

        System.out.println(queue.peek()); // first element of queue

        System.out.println("removing");
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
