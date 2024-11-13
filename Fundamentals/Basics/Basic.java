class Basic {
    // constant

    static final double PI = 3.14;

    public static void main(String[] args) {
        // simple print
        System.out.println("Hello World");

        // variable's #scope gloable

        int temp = 10;
        float percentage = 1.0f;

        float total = (temp + percentage);

        System.out.println("total test : " + total);
        System.out.println("PI : " + PI);

        // conditionals statement
        int x = 10;
        int y = 20;
        int z = 30;

        // if else with logical and operations
        if (x > y && x > z) {
            System.out.println("x is gretest" + x);
        } else if (y > z) { // we are not compile xy > x because we already check x > y and it false than
                            // only it come here to check y > z
            System.out.println("y is gretest" + y);
        } else {
            System.out.println("z is gretest" + z);
        }

        // ternary opertaion
        int turnary = (x > y) ? x : y;
        System.out.println("turnary : " + turnary);

        // switch case
        int n = 2;

        switch (n) {
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("default");
                break;
        }

        // loop -- while
        int i = 0;

        while (i <= 10) {
            System.out.println("while loop i : " + i);
            // inner loop
            int j = 1;
            while (j <= 3) {
                System.out.println("j : " + j);
                j++;
            }
            i++;
        }

        // loop -- do while
        do {
            // here i value is 11 because it incremened in while loop
            System.out.println("do while loop i : " + i);
        } while (i > 20);

        // loop -- for
        for (int k = 1; k <= 9; k++) {
            System.out.println("Day : " + k);
            for (int t = 1; t <= 9; t++) {
                // in this we have to put (t+8) because it bydefault add with string
                System.out.println("Working Time : " + (t + 8) + "-" + (t + 9));
            }
        }

    }
}