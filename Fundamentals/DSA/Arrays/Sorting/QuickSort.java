package Arrays.Sorting;

public class QuickSort {

    public int partition(int arr[], int low, int high) {
        int pivot = arr[low];  // arr[0]
        int start = low;
        int end = high;

        while (start < end) {
            // 0 <= 0
            while (arr[start] <= pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if (start < end) {
                swap(arr, start, end);
            }
        }
        // 0 - low swap end (pivot swap)
        swap(arr, low, end);
        
        // Debugging: Print the array after partitioning
        System.out.println("Pivot element: " + arr[end]);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line
        return end;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 12, 64, 8, 1, 5, 3, 2};
        QuickSort qs = new QuickSort();
        
        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        qs.quickSort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
