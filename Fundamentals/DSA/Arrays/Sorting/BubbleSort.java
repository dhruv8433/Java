// Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order. it directly compares 2 numbers of array and swap
// Time Complexity: O(n^2) where n is the number of elements in the array.
// Space Complexity: O(1)


package Arrays.Sorting;

public class BubbleSort {
   public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
   }
}
