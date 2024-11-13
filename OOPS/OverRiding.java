

class A {
    public void show() {
        System.out.println("in A");
    }

    public void config() {
        System.out.println("in A config");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B"); // this is called method overriding
    }
}

public class OverRiding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}

// Method Overriding in Java
// If subclass (child class) has the same method as declared in the parent
// class, it is known as method overriding in Java.
// In other words, If subclass provides the specific implementation of the
// method that has been provided by one of its parent class, it is known as
// method overriding.

// Usage of Java Method Overriding
// Method overriding is used to provide the specific implementation of a method
// that is already provided by its superclass. Method overriding is used for
// runtime polymorphism

// Rules for Java Method Overriding
// 1. The method must have the same name as in the parent class
// 2. The method must have the same parameter as in the parent class.
// 3. There must be an implementation method in the subclass.

// Characteristics for Java Method Overriding
// 1. Method overriding is used to provide the specific implementation of a
// method that is already provided by its superclass.
// 2. Method overriding is used for runtime polymorphism
// 3. Rules for Java Method Overriding
// 4. The method must have the same name as in the parent class
// 5. The method must have the same parameter as in the parent class.