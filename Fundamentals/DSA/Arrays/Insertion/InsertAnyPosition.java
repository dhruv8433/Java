// another way to insert element at any position in array

package Arrays.Insertion;

import java.util.Scanner;

public class InsertAnyPosition {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        // take input for which postion
        Scanner sc = new Scanner(System.in);
        System.out.println("which position you want to add element:");
        int pos = sc.nextInt();
        // which element you want to add
        System.out.println("which elemnt you want to add:");
        int element = sc.nextInt();

        // neww array
        int newarr[] = new int[arr.length + 1]; // increment the size

        for (int i = 0, j = 0; i < newarr.length; i++) {
            if (i == pos) {
                newarr[pos] = element; // add element at position
            }else{
                newarr[i] = arr[j];
                j++;
            }
        }
        // display array
        for (int newarry : newarr) {
            System.out.println(newarry);
        }
    }
}
