class Mobiles {
    static String name; // static variable is shared among all objects so it's value is common
    int price;
    String brand;

    static { // static block is used to initialize the static variables and called only once
        name = "Mobile";
        System.out.println("Static block is called");
    }

    // constructor to initialize the values
    public Mobiles() {
        price = 200;
        brand = "";
    }

    public void display() {
        System.out.println("Name: " + name + " Price: " + price + " Brand: " + brand);
    }
}

public class StaticVariable {
    public static void main(String[] args) throws ClassNotFoundException {

        // if we don't want to create object of the class and just call the class without creating object
        // then we can use Class and for that we have to throw ClassNotFoundException
        Class.forName("Mobiles");

        Mobiles m1 = new Mobiles();
        Mobiles.name = "smartphone"; // static variable is shared among all objects so we can access it directly
                                     // using class name
        m1.price = 10000;
        m1.brand = "Samsung";

        Mobiles m2 = new Mobiles();
        Mobiles.name = "smartphone";
        m2.price = 100000;
        m2.brand = "Apple";

        Mobiles m3 = new Mobiles();

        m1.display();
        m2.display();
        m3.display();
    }
}
