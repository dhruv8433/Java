package LinkedList;
import java.util.*;

public class LLPreDefined {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addLast("list");
        list.addFirst("this");
        System.out.println(list);

        System.out.println(list.size());
        
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
