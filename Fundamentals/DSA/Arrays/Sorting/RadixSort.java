/*
 * Time Complexity: O(d * (n + k)), where:
 * 
 * d is the number of digits in the largest number.
 * n is the number of elements in the input array.
 * k is the range of the digit (for example, 10 for decimal numbers).
 */

 // it actually use counting sort

package Arrays.Sorting;

import java.util.Arrays;

public class RadixSort {
    // Counting Sort for sorting based on digit
    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            // arr[i] would be 170 when i = 0
            // This divides the number arr[i] by exp to shift the current digit (determined by exp) to the rightmost position if exp= 10 then 170 / 10 = 17
            count[(arr[i] / exp) % 10]++;
        }

        // Change count[i] so that count[i] now contains actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] contains sorted numbers according to current digit
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Main function to implement Radix Sort
    public static void radixSort(int[] arr) {
        // Find the maximum number to figure out the number of digits
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

        // Do counting sort for every digit. Note that the exp is 10^i where i is the current digit number
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main driver code
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original Array:");
        printArray(arr);

        radixSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
