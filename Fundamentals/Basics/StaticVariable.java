class Mobiles {
    static String name; // static variable is shared among all objects so it's value is common
    int price;
    String brand;

    // constructor to initialize the values
    public Mobiles() {
        price = 200;
        brand = "";
    }

    public void display() {
        System.out.println("Name: " + name + " Price: " + price + " Brand: " + brand);
    }

    static { // static block is used to initialize the static variables and called only once
        name = "Mobile";
        System.out.println("Static block is called");
    }

    public static void testMethod() {
        System.out.println("This is a static method");
        System.out.println(name); // we can use static variable in static method but don't use non-static variable
        // System.out.println(brand); // this will give error
    }

    // we can use non-static variable in static method but not vice versa
    public static void testMethod2(Mobiles m) {
        System.out.println("This is a non-static method");
        System.out.println(name);
        System.out.println(m.brand); // we can use non-static variable in static method with the help of passing
                                     // object reference
    }
}

public class StaticVariable {
    public static void main(String[] args) throws ClassNotFoundException {

        // if we don't want to create object of the class and just call the class
        // without creating object
        // then we can use Class and for that we have to throw ClassNotFoundException
        Class.forName("Mobiles");

        Mobiles m1 = new Mobiles();
        Mobiles.name = "smartphone"; // static variable is shared among all objects
        // so we can access it directly
        // using class name
        m1.price = 10000;
        m1.brand = "Samsung";

        Mobiles m2 = new Mobiles();
        Mobiles.name = "njbhiviv";
        m2.price = 100000;
        m2.brand = "Apple";

        Mobiles m3 = new Mobiles();

        m1.display();
        m2.display();
        m3.display();

        // we can directly access static method using class name
        Mobiles.testMethod();

        Mobiles.testMethod2(m2);
    }
}
