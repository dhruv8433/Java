public class Strings {
    public static void main(String[] args) {
        // String name = "xyz";
        // or we create a new String object because String is immutable in Java and it's
        // class #String
        String name = new String("xyz");
        System.out.println("hello " + name);

        // hashcode() method
        System.out.println(name.hashCode());

        // methods
        System.out.println("Length of string is " + name.length());

        // charAt() method
        System.out.println("charAt location 0 " + name.charAt(0));

        // substring() method - returns a substring of the string
        System.out.println(name.substring(1));

        // substring() method - returns a substring of the string
        System.out.println(name.substring(1, 2));

        // indexOf() method - returns the index of the first occurrence of the specified
        // substring
        System.out.println(name.indexOf("y"));
        System.out.println(name.indexOf("z"));
        System.out.println(name.indexOf("z", 2));

        // lastIndexOf() method - returns the index of the last occurrence of the
        // specified substring
        System.out.println(name.lastIndexOf("z"));
        System.out.println(name.lastIndexOf("z", 2));

        // startsWith() and endsWith() methods - checks if the string starts or ends
        // with the specified substring
        System.out.println(name.startsWith("x"));
        System.out.println(name.endsWith("z"));

        // equals() and equalsIgnoreCase() methods - checks if the string is equal to
        // the specified string
        System.out.println(name.equals("xyz"));
        System.out.println(name.equalsIgnoreCase("XYZ"));

        // String concatenation
        String name2 = "abc";
        System.out.println(name.concat(name2));

        // bydefault, the string is immutable in Java means that it cannot be changed
        // for mutable string, we can use StringBuffer or StringBuilder
        StringBuffer sb = new StringBuffer("abc");
        sb.append("def");
        System.out.println(sb);
        System.out.println("capacity of string buffer is " + sb.capacity());

        // delete and insert methods
        sb.delete(1, 3);
        System.out.println("delete data from string 1 to 3 location "+sb);

        // insert method
        sb.insert(1, "bc");
        System.out.println("insert bc in string " + sb);

    }
}
