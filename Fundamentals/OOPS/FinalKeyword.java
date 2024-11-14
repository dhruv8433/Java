// Final - variable, method, class

final class DemoFinal{
    final int MAX_VALUE = 99;
    final void display(){
        System.out.println("Final method");
    }
}

// class Test extends DemoFinal{ // Throw error can't extend DemoFinal class
    // void display(){ // error: display() in Test cannot override display() in DemoFinal
    //     System.out.println("Final method");
    // }
// }

public class FinalKeyword {
    public static void main(String[] args) {
        final int num = 8;
        // num = 10; // error: cannot assign a value to final variable num

        System.out.println(num);
    }
}

// Final
// 1. Final variable - constant
// 2. Final method - method overriding
// 3. Final class - class inheritance

// Final used for constant initialization