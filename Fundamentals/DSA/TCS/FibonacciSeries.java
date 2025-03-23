public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int c = 0;

        // first 2 are const
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b; // add sum of 0 + 1, 1 + 1, 1 + 2 ...
            System.out.print(c + " ");
            a = b; // change 0 to 1, 1 to 1, 1 to 2 ...
            b = c; // change 1 to 1, 1 to 2, 2 to 3 ...
        }
    }
}
