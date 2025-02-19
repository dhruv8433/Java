package Strings;

public class Intro {
    public static void main(String[] args) {
        // \0 means null
        char str[] = {'a', 'b', 'c', 'd', '\0'};
        String[] str1 = {"hello", "world"};

        System.out.println(str);
        System.out.println(str.length);

        String str2 = "123";

        int number = Integer.parseInt(str2);
 
        System.out.println(number);

        int number1 = 123;

      String str3 = Integer.toString(number1);

      System.out.println(str3);
    }
}
