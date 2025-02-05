package Arrays.Deletion;

import java.util.Scanner;

public class DeletionOnSpecificIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};  // Initial array
        int n = arr.length;  // Number of elements

        // Print original array
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter position (1-based index) to delete: ");
        int position = scanner.nextInt();

        // Validate position
        if (position < 1 || position > n) {
            System.out.println("Invalid position! Please enter a valid index.");
            return;
        }

        // Create a new array with size n-1
        int[] newArr = new int[n - 1];

        // Copy elements except the one at the given position
        for (int i = 0, j = 0; i < n; i++) {
            if (i != position) {
                newArr[j] = arr[i];
                j++;
            }
        }

        // Print new array
        System.out.println("Array after deletion:");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
