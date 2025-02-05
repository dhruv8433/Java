package Arrays.Insertion;

public class InsertOnstart {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int element = 100;

        // create new array of size n+1
        int[] newArr = new int[arr.length + 1];

        // insert element at the given position
        // first we clear that postion and move to next locations
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[i + 1] = arr[i];
        }
        // add element on specific position
        newArr[0] = element;

        // print array using for each
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
