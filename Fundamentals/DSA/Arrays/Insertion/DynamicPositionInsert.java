// in this code we take mainly 2 input one is element and other is position and then we insert that element into that position

package Arrays.Insertion;

import java.util.Scanner;

public class DynamicPositionInsert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // take user input for the number of elements in the array
        System.out.println("Enter the number of elements in the array: ");
        int n = s.nextInt();

        // create dynamic size array
        int[] arr = new int[n];

        // Add elements to the array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " +i + "th elements of the array: ");
            arr[i] = s.nextInt();
        }

        // print array using for each
        System.out.println("Your array size of"+ arr.length+" is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // take user input for the element to be inserted
        System.out.println("\nEnter the element to be inserted: ");
        int element = s.nextInt();
        System.out.println("Enter postion you want to insert from position 1 to " + (n + 1) +": ");
        int position = s.nextInt();

        if(position < 0 || position > n + 1){
            System.out.println("Invalid position");
            return;
        }

        // create new array of size n+1
        int[] newArr = new int[n + 1];

        // copy elements from old array to new array
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }

        // insert element at the given position
        // first we clear that postion and move to next locations
        for (int i = n - 1; i >= position - 1; i--) {
            newArr[i+1] = newArr[i];
        }
        // add element on specific position
        newArr[position] = element;
        
        // print array using for each
        System.out.println("Your array size of"+ arr.length+" is: ");
        for (int i : newArr) {
            System.out.print(i + " ");
        }

    }
}
