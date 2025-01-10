import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class StudentsCollections {
    int age;
    String name;

    public StudentsCollections(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentsCollections [age=" + age + ", name=" + name + "]";
    }

}

public class JavaCollections {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(18);
        nums.add(7);
        nums.add(3);
        nums.add(3);

        for (Object n : nums) {
            int num = (Integer) n;
            System.out.println(num);
        }

        System.out.println("Index 2 :" + nums.get(2));
        System.out.println("Index of 18 :" + nums.indexOf(18));

        // Set<Integer> numSet = new HashSet<Integer>();
        Set<Integer> numSet = new TreeSet<Integer>();
        numSet.add(1);
        numSet.add(18);
        numSet.add(7);
        numSet.add(3);
        numSet.add(3);

        for (Object n : numSet) {
        int num = (Integer) n;
        System.out.println(num);
        }

        // we can also print using iterators
        System.out.println("using iterators");
        Iterator<Integer> it = numSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // map
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Values of map : " + map);
        System.out.println("Values of map with key : " + map.get("one"));

        System.out.println("all keys in map : " + map.keySet());

        // printing all keys and values
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }

        // sorting
        List<Integer> numList = new ArrayList<Integer>();
        numList.add(110);
        numList.add(18);
        numList.add(76);
        numList.add(39);

        Collections.sort(numList);
        System.out.println("Sorted List : " + numList);

        // comparator is used for custom sorting logic
        // let's say i want to compare 2 no based on last digit
        Comparator comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) // 36, 12 than 6 > 2 than swap
                    return 1; // if i%10 is greater than j%10 then return 1
                else if (i % 10 < j % 10)
                    return -1; // if i%10 is less than j%10 then return -1
                else
                    return 0; // if both are equal then return 0
            };
        };

        Collections.sort(numList, comp);
        System.out.println("Sorted List based on last digit : " + numList);

        List<StudentsCollections> students = new ArrayList<>();
        students.add(new StudentsCollections(10, "A"));
        students.add(new StudentsCollections(20, "B"));
        students.add(new StudentsCollections(15, "C"));

        for (StudentsCollections s : students) {
            System.out.println(s);
        }

        // sorting based on age
        // Comparator<StudentsCollections> comp2 = new Comparator<StudentsCollections>()
        // {
        // @Override
        // public int compare(StudentsCollections s1, StudentsCollections s2) {
        // if (s1.age > s2.age)
        // return 1; // 1 means swap
        // else if (s1.age < s2.age)
        // return -1; // -1 means no swap
        // else
        // return 0;
        // }
        // };

        // using ternary operator
        // using lambda with single line
        Comparator<StudentsCollections> comp2 = (s1, s2) -> s1.age > s2.age ? 1 : -1;
        // if (s1.age > s2.age)
        // return 1; // 1 means swap
        // else if (s1.age < s2.age)
        // return -1; // -1 means no swap
        // else
        // return 0;

        // after swapping
        System.out.println("After sorting based on age");
        Collections.sort(students, comp2); // sorting based on age
        for (StudentsCollections s : students) {
            System.out.println(s);
        }
    }

}

// collections have 3 types

// collection API
// collection - for interfaces
// collections - for classes

// implemente using 4 types
// 1. List -> ArrayList, LinkedList
// 2. Set -> HashSet, LinkedHashSet
// 3. queue -> DeQueue
// 4. Map -> HashMap, LinkedHashMap

// List support duplicate values while set only support unique values in output

// use treeSet for gettin sorted values