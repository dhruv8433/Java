import java.util.Arrays;

public class SecondSmallestAndLargest {
    public static void main(String[] args) {

        int[] arr = { 10, 2, 3, 4, 5 };
        int n = arr.length;

        // using defined method Sort
        Arrays.sort(arr);
        
        System.out.println("Second Largest : " + arr[arr.length - 2]);
        System.out.println("Second Smallest : " + arr[1]);
       
        // without defined method Sort
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("without defined method Sort");
        System.out.println("Second Largest : " + arr[arr.length - 2]);
        System.out.println("Second Smallest : " + arr[1]);
    }
}