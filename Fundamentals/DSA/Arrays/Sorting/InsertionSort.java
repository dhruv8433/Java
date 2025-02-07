package Arrays.Sorting;

public class InsertionSort {
    public static void InsertionSorting(int arr[]) {
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for (int i = 0; i < n; i++) {
            
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        InsertionSorting(arr);
    }
}
