public class Armstrong {
    public static void main(String[] args) {
        int num = 153;

        int temp = num;
        int sum = 0;

        // for(int i = 0; i < num; i++) {
        //     // armstrong find from index 0 to n
        //     int n = (int) Math.log10(temp) + 1;
        //     System.out.println("Number of digits: " + n);
        //     break;
        // }

        while (temp != 0) {
            // getting last digit
            int last_dig = temp % 10;
            System.out.println("Last Digit: " + last_dig);

            // removing last digit from the temp
            temp = temp / 10;
            System.out.println("After remove" + temp);

            // adding cube of last digit to sum
            sum += (last_dig * last_dig * last_dig);             
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
