public class Patterns {
    public static void main(String[] args) {

        System.out.println("Pattern 1");
        for (int i = 0; i < 5; i++) {
            System.out.println("*");
        }
        System.out.println();

        System.out.println("Pattern 2");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 3");
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("Pattern 4");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // pattern 2
        // for (int i = 0; i < 5; i++) {
        // for (int j = 5; j > i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // System.out.println();

        // // pattern 3
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 5; k > i; k--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // System.out.println();

        // // pattern 4
        // for (int i = 0; i < 5; i++) {
        // for (int j = 5; j > i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k <= i; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // System.out.println();

        // // pattern 5
        // for (int i = 0; i < 5; i++) {
        // for (int j = 5; j > i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k <= i; k++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // System.out.println();

        // // pattern 6
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 5; k > i; k--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // System.out.println();

        // // pattern 7
        // for (int i = 0; i < 5; i++) {
        // for (int j = 5; j > i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k <= i; k++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // System.out.println();

    }
}
