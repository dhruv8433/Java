class MyExprections extends Exception {  // custom exception class
    public MyExprections(String message) {
        super(message);  // print custom error message
    }
}

public class JavaExceptions {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }
}

// Exceptions
// An exception is an event that occurs during the execution of a program that
// disrupts the normal flow of instructions. In general, when a Java program is
// compiled, the compiler checks for syntax errors. However, an exception is
// an error that occurs at runtime. An exception is an object that wraps an
// error event that occurred within a method and contains information about the
// method and the exception. When an error occurs within a method, the method
// creates an object and hands it off to the runtime system. The object, called
// an exception object, contains information about the error, including its
// type and the state of the program when the error occurred. Creating an
// exception object and handing it to the runtime system is called throwing an
// exception.
