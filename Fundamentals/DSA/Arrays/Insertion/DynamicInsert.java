package Arrays.Insertion;

import java.util.Scanner;

public class DynamicInsert {
    public static void main(String[] args) {
        // take user input for the number of elements in the array
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = s.nextInt();
        
        // array of dynamic size
        int[] arr = new int[n]; 

        // Add elements to the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // print array using for each
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
