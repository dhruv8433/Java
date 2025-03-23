// TODO: How LCM Works
// LCM is the least number that is divisible by both numbers (n1 and n2).
// For example, LCM of 15 and 20 is 60.
// 15: 15, 30, 45, 60, 75, 90, 105, 120, 135, 150 ...
// 20: 20, 40, 60, 80, 100, 120, 140, 160, 180, 200 ...

public class LeastCommonMultiple {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 20;
        int lcm = 1;
        int max = Math.max(n1, n2); // 20
        int min = Math.min(n1, n2); // 15

        /*
         * 1; 1<= 20;
         * 2; 2<= 20;
         * 3; 3<= 20;
         * 4; 4<= 20;
         */
        for (int i = 1; i <= max; i++) {
            // lcm= 20 * 1 = 20
            // lcm= 20 * 2 = 40
            // lcm= 20 * 3 = 60
            // lcm= 20 * 4 = 80
            // ...
            // lcm= 20 * 20 = 400

            lcm = max * i;
            // If lcm is divisible by min, then it is the LCM
            // Break the loop as soon as we find the LCM
            if (lcm % min == 0) {
                break;
            }
        }

        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
    }
}
