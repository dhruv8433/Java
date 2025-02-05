package Arrays.Deletion;

public class DeletionOnStart {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 20, 50, 80, 90 };

        // create new array of size n-1
        int[] newArr = new int[arr.length - 1];

        // delete element from start of array
        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        // print array using for each
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }   
}
