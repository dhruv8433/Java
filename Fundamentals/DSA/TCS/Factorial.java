public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i; // multiply with next number
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
