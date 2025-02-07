package Arrays.Sorting;

public class SelectionSort {

    public static void SelectionSorting(int[] arr) {
        // System.out.println("Lengt of array " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println((j < arr.length) + " for index" + j + " " + arr[j]);
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            System.out.println("Pass "+ i + " : "+arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 64, 25, 12, 22, 11 };
        SelectionSorting(arr);
    }
}
