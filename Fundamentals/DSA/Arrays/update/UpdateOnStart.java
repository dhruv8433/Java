package Arrays.update;

import java.util.Scanner;

public class UpdateOnStart {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Your array is: ");
        for (int i : arr) {
            System.out.println(i + " ");
        }

        System.out.println("Enter the element you want to update: ");
        int element = s.nextInt();

        arr[0] = element;
        System.out.println("Updated array is: ");

        for (int i : arr) {
            System.out.println(i + " ");
        }
        
    }
}
