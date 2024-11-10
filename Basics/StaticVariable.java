class Mobiles {
    static String name; // static variable is shared among all objects so it's value is common
    int price;
    String brand;

    public void display() {
        System.out.println("Name: " + name + " Price: " + price + " Brand: " + brand);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobiles m1 = new Mobiles();
        Mobiles.name = "smartphone"; // static variable is shared among all objects so we can access it directly
                                     // using class name
        m1.price = 10000;
        m1.brand = "Samsung";

        Mobiles m2 = new Mobiles();
        Mobiles.name = "smartphone";
        m2.price = 100000;
        m2.brand = "Apple";

        m1.display();
        m2.display();
    }
}
