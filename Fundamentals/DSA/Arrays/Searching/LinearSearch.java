// Linear Search is a technique for searching elements from start to end 
// Time Complexity = O(n)
// Space Complexity = O(1)

package Arrays.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90, 12 };
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int element = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index: " + i + " with value: " + arr[i]);
                return;
            }
        }
    }   
}
