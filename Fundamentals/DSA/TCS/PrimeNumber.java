public class PrimeNumber {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;

        // 2, 2 <= 29/ 2, 2 <= 14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Divisible by: " + i);
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
