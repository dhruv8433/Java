package Basic;
public class BasicMethod {
    // Static methods
    static void newMethod() {
        System.out.println("This is a new method");
    }

    // main method
    public static void main(String[] args) {
        newMethod();
        BasicMethod obj = new BasicMethod();
        obj.anotherMethod();
        obj.methodWithParameters(10, 20);
    }   

    // Non-static methods
    void anotherMethod() {
        System.out.println("This is another method");
    }

    // Non-static methods with parameters
    void methodWithParameters(int a, int b) {
        System.out.println("Sum of a and b is: " + (a + b));
    }
}
