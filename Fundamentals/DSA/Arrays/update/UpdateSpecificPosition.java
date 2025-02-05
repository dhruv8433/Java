package Arrays.update;

import java.util.Scanner;

public class UpdateSpecificPosition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Your array is: ");
        for (int i : arr){
            System.out.print(i + " ");
        }

        System.out.println("Enter Position you want to update : ");
        int position = s.nextInt();

        if(position < 0 || position > n){
            System.out.println("Invalid position");
            return;
        }
        else{
            System.out.println("Enter the element you want to update: ");
            int element = s.nextInt();

            arr[position] = element;

            System.out.println("Array after updating element at position " + position + " is: ");
            for (int i : arr){
                System.out.print(i + " ");
            }
        }
    }
}
