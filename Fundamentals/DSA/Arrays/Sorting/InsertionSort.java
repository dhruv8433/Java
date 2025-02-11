package Arrays.Sorting;

public class InsertionSort {
    public static void InsertionSorting(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;  // index of previous element

            // j is greater than index 0
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 64, 25, 12, 22, 11 };
        InsertionSorting(arr);
    }
}
