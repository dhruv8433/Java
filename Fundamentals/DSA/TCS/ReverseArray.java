public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9 };
        int[] reverseArr = new int[arr.length];

        /**
         * i = 5; 5 > 0; i--
         * rev[5 - 5 = 0] = arr [5 - 1];
         * i = 4; 4 > 0; i--
         * rev[5 - 4 = 1] = arr [4 - 1];
         */

        for (int i = arr.length; i > 0; i--) {
            reverseArr[arr.length - i] = arr[i - 1];
        }

        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nReversed Array: ");
        for (int i = 0; i < reverseArr.length; i++) {
            System.out.print(reverseArr[i] + " ");
        }
    }
}
