class C1 {
    public void show() {
        System.out.println("In A Show");
    }
}

class C2 extends C1 {
    public void show() {
        System.out.println("In B Show");
    }
}

class C3{

}

public class Polymorphism {
    public static void main(String[] args) {
        C1 obj = new C2(); // NOTE: here we create object of c1 class using c2 -- refrence of A
        obj.show();

        C1 a = new C1(); // NOTE: here we create object of c1 class
        a.show();

        a = new C2(); // NOTE: here we create object of c2 class
        a.show();

        // same object a -- behave differently with different class called dynamic methods dispatching
        // only work in inheritance

        // a = new C3(); // NOTE: Throw error it only work when we use extends keyword
    }
}

// Polymorphism
// - Poly means many and morphism means forms
// - Polymorphism is the ability of a variable, function or object to take on
// multiple forms

// Compile Time Polymorphism also called Early binding Polymorphism
// - Method Overloading

// Run time Polymorphism also called Late binding Polymorphism
// - Method Overriding

// Polymorphism characteristics
// - Method overloading is an example of compile time polymorphism
// - Method overriding is an example of runtime polymorphism
// - Polymorphism is extensively used in implementing inheritance

// Dynamic Method Dispatching - [OverRiding]

/*
 * - Dynamic method dispatch is a mechanism by which a call to an overridden
 * method is resolved at runtime.
 * - When an overridden method is called by a reference, Java determines which
 * version of that method to execute based on the type of object it refers to.
 */