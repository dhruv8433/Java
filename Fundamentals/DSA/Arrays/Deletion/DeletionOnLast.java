package Arrays.Deletion;

public class DeletionOnLast {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 20, 50, 80, 90 };

        // create new array of size n-1
        int[] newArr = new int[arr.length - 1];

        // delete element from end of array
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        // print array using for each
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
