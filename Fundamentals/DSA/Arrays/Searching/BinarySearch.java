// Binary Search is a searching algorithm that finds the position of a target value within a sorted array. It compares the target value to the middle element of the array. If they are not equal, the half in which the target cannot lie is eliminated and the search continues on the remaining half, again taking the middle element to compare to the target value, and repeating this until the target value is found. If the search ends with the remaining half being empty, the target is not in the array.

// Time Complexity = O(log n)
// Space Complexity = O(1)

package Arrays.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 11, 12, 22, 25, 34, 64, 90 };
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the element to search: ");
        int element = s.nextInt();

        for (int i = 0; i < arr.length; i++) {
            // decide low and high index of the array
            int low = 0;
            int high = arr.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;  // 0 + (7 - 0) / 2 = 3 
                if (arr[mid] == element) {
                    System.out.println("Element found at index: " + mid + " with value: " + arr[mid]);
                    return;
                } else if (arr[mid] < element) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    }
}
