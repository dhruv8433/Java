/*
 * NOTE
 * 
 * class - class -> extends
 * class - interface -> implements
 * interface - interface -> extends
 *  
 */

interface Computer {
    void coding(); // abstract method and class for just declaring

    // int age; // we can create variables but bydefault it is final and static
    public static final int age = 10; // bydefault it is final and static or
    int no = 10; // we can also write like this
}

interface X {
    void run();
}

interface Y extends X { // interface can extends another interface
    void walk();
}

class Laptop implements Computer, X { // multiple inheritance -- more than one interface can be implemented
    public void coding() {
        System.out.println("Code, Compile and Run");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Run");
    }
}

class Desktop implements Computer {
    public void coding() {
        System.out.println("Code, Compile and Run : Faster");
    }
}

class Mobile implements Computer {
    public void coding() {
        System.out.println("Code, Compile and Run : Slow");
    }
}

class Developer {
    public void devApp(Computer c) { /*
                                      * it means i need laptop to develop so i accept laptop object but if we do
                                      * this
                                      * it means it only works with laptop not with desktop
                                      * so solution is we use computer class
                                      */
        c.coding(); // only code when i have laptop
    }
}

public class JavaInterface {
    public static void main(String[] args) {
        // Laptop laptop = new Laptop(); // create laptop object
        // Desktop desktop = new Desktop(); // create desktop object some companies will
        // use desktop

        /*
         * instead of creating laptop and desktop object we're going to create computer
         * object
         */

        Computer c = new Laptop();
        Computer d = new Desktop();
        Computer m = new Mobile();

        Developer dhruv = new Developer();
        dhruv.devApp(c);
        dhruv.devApp(d);
        dhruv.devApp(m);

        // dhruv.walk(); // Error : The method walk() is undefined for the type
        // Developer
        X obj = new Laptop();
        obj.run();

        // Computer.age = 10; // Error : The final field Computer.age cannot be assigned

        // i can directly call variables with the help of variables
        System.out.println(Computer.age);
    }
}

// Interface
// 1. Interface in Java is a blueprint of a class.
// 2. It has static constants and abstract methods.

// bydefault every method in interface is public and abstract