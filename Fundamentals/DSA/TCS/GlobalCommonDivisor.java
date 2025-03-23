public class GlobalCommonDivisor {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 20;
        int gcd = 1;

        // for (int i = 1; i <= n1 && i <= n2; i++) {
        //     if (n1 % i == 0 && n2 % i == 0) {
        //         gcd = i;
        //     }
        // }

        //or

        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;  // 15 - 20 = -5
            } else {
                n2 -= n1;  // 20 - 15 = 5
            }
        }
        gcd = n1; // 5


        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
