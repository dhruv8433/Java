public class WrapperClass {
    public static void main(String[] args) {
        int i = 5; // primitive datatype
        Integer ii = new Integer(i); // boxing or wrapping -- Autoboxing

        int j = ii.intValue(); // unboxing or unwrapping -- autounboxing
        System.out.println(j);

        Integer value = i; // auto boxing
        int k = value; // auto unboxing
        System.out.println(k);

        String str = "123";
        int num = Integer.parseInt(str); // converting string to integer 

        System.out.println(num + 2);
    }
}


// Java is 99.9% object-oriented programming languages but when we use variables in java it's like int, float which is primitive not objects and if you want to use objects in variables then we use wrapper classes.