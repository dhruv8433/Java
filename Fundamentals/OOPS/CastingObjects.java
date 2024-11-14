class A11 {
    public void show1() {
        System.out.println("in A11");
    }
}

class B11 extends A11 {
    public void show2() {
        System.out.println("in B11");
    }
}

public class CastingObjects {
    public static void main(String[] args) {
        A11 obj = new B11(); // this is called upcasting
        obj.show1(); // we can access class A11 methods directly

        B11 obj1 = (B11) obj; // this is called downcasting
        obj1.show2(); // we can access class B11 methods
    }
}

// upcasting
// When we create an object of a subclass and assign it to a reference variable, it is known as upcasting

// downcasting
// When we create an object of a superclass and assign it to a subclass reference variable, it is known as downcasting