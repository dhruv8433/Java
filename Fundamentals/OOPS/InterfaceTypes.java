@FunctionalInterface
interface MyFunctionalInterface { // SAM - single abstract method or Functional interface
    void show();
    // void hide(); // Invalid '@FunctionalInterface' annotation;
    // MyFunctionalInterface is not a functional interfaceJava(553648792)
}

public class InterfaceTypes {
    public static void main(String[] args) {
        MyFunctionalInterface obj = () -> {    // -> called lamda expression
            System.out.println("Show method");
        };

        obj.show();
    }
}

// Interface is a reference type in Java, similar to a class, that can contain
// only constants, method signatures, default methods, static methods, and
// nested types. Method bodies exist only for default methods and static
// methods. Interfaces cannot be instantiated—they can only be implemented by
// classes or extended by other interfaces.

// Types
// 1. Normal Interface - a normal interface have 2 or more methods
// 2. Functional Interface (Single Abstract Method - SAM) - only one method
// 3. Marker Interface - a marker interface is an interface that has no methods
// or constants inside it. It provides run-time type information about objects.