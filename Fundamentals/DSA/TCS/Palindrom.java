public class Palindrom {
    public static void main(String[] args) {
        int num = 1221;

        int temp = num;
        int rev = 0;

        while (temp != 0) {
            // getting last digit
            int last_dig = temp % 10;
            System.out.println("Last Digit: " + last_dig);

            // removing last digit from the temp
            temp = temp / 10;

            // adding last digit to rev
            /**
             * 0 = 0 + 1
             * 1 = 10 + 2
             * 12 = 120 + 2
             * 122 = 1220 + 1
             * 1221
             * rev = rev * 10 + lastdig
             */
            rev = rev * 10 + last_dig;
            System.out.println("Reversed: " + rev);
        }

        if (rev == num) {
            System.out.println(num + " is a Palindrom number." + rev);
        } else {
            System.out.println(num + " is not a Palindrom number.");
        }
    }
}
