class A13 {
    void show() {
        System.out.println("A13");
    }
}

class B13 extends A13 {
    void show() {
        System.out.println("B13");
    }
}

public class AnoonymusInnerClass {
    public static void main(String[] args) {
        A13 obj = new A13() {
            void show() {
                // new immplementation of class A13 in main method #innerclass
                System.out.println("Anonymous Inner Class");
            }
        };
        obj.show();
    }
}

// Anoonymus Inner Class
// 1. An inner class declared without a name is known as an anonymous inner
// class.
// 2. In case of an anonymous inner class, we declare and instantiate the class
// at the same time.
// 3. An anonymous inner class extends an abstract class or implements an
// interface.
// 4. An anonymous inner class is defined and instantiated in a single
// statement.
// 5. An anonymous inner class is created using an interface or an abstract
// class.