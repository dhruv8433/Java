package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueExample {
   public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addFirst(6); // first element
        deque.addLast(97);
        deque.add(57);  
        deque.addLast(45); // last element

        deque.removeLast();
        deque.removeFirst();
        System.out.println(deque);
   } 
}
