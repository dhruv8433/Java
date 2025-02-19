package Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello World");

        System.out.println(str.replace(2, 5, "123"));

        str.insert(0, "NewStr Insert");
        System.out.println(str);

        str.delete(0, 5);

        System.out.println(str);

        str.reverse();

        System.out.println(str);

        str.append("Appened");

        System.out.println(str);

    }
}
