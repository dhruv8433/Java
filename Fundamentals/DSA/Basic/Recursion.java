package Basic;
// Recursion is a programming technique where a method calls itself to perform a sub-operation as necessary. The method which is calling itself is termed as a recursive function. Recursion is primary used to break big problems into smaller problems and then solving them recursively. Recursion technique makes code more readable and expressive.

public class Recursion {
    // recursive function that sum together all numbers from 1 to n
    // public int sum(int n) {
    //     // recursive method call
    //     return n == 1 ? 1 : n + sum(n - 1);
    // }
    // public static int fib(int n) {
    //     if (n <= 1) return n; // Base case
    //     return fib(n - 1) + fib(n - 2); // Recursive case
    // }

    // public static int factorial(int n) {
    //     if (n == 0) return 1; // Base case
    //     return n * factorial(n - 1); // Recursive call
    // }

    // public static void main(String[] args) {
    //     Recursion obj = new Recursion();
    //     // System.out.println(obj.sum(5)); 
    //     // System.out.println(fib(6)); // 8 (0, 1, 1, 2, 3, 5)
    //     System.out.println(factorial(5)); // 120 (5 * 4 * 3 * 2 * 1)
    // }
    public static int fib(int n) {
        if (n <= 1) return n; // Base case
        return fib(n - 1) + fib(n - 2); // Recursive case
    }
    public static void main(String[] args) {
        System.out.println(fib(6)); // 8 (0, 1, 1, 2, 3, 5, 8) 
    }
}
