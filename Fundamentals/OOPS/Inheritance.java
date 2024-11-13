
public class Inheritance {
    public static void main(String[] args) {
        VeryAdvanceCalc c = new VeryAdvanceCalc();

        // in advance calc there is no add and sub method but it is inherited from Calc class so we can use it
        System.out.println(c.add(10, 20));
        System.out.println(c.sub(10, 20));
        System.out.println(c.multiplication(10, 2));
        System.out.println(c.division(18, 2));
        System.out.println(c.power(4, 2));
    }
}


// Inheritance is a mechanism in which one class acquires the property of another class. For example, a child inherits the traits of his/her parents. With inheritance, we can reuse the fields and methods of the existing class.
// The class which inherits the properties of other is known as subclass (derived class, child class) and the class whose properties are inherited is known as superclass (base class, parent class).

// Types of Inheritance in Java
// 1. Single Inheritance
// 2. Multilevel Inheritance
// 3. Hierarchical Inheritance
// 4. Multiple Inheritance
// 5. Hybrid Inheritance

// Characteristics of Inheritance
// 1. Code Reusability: It is the most important benefit of Inheritance. Inheritance allows us to reuse the fields and methods of the existing class.
// 2. Method Overriding: Inheritance allows us to override the methods of the existing class so that we can define a new behavior to the existing methods.
// 3. Extensibility: Inheritance is used to create a new class that is built upon an existing class. When we want to create a class that is similar to an existing class except for some modifications, we can derive our new class from the existing class.
