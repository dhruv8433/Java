package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        // ArrayList<String> list2 = new ArrayList<>();

        // add
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // get element -> based on index
        int element = list.get(0);
        System.out.println("on index 0 : " + element);

        // add element on specific index
        list.add(1, 1);
        System.out.println(list);

        // set element -> update
        list.set(0, 5);
        System.out.println(list);

        // delete element
        list.remove(4);
        System.out.println(list);

        // ssize
        System.out.println("size : " + list.size());

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int i : list) {
            System.out.println(i);
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
