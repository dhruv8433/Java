package Arrays.Insertion;

public class InsertOnLast {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 20, 50, 80, 90};
        int element = 100;

        // create new array of size n+1
        int[] newArr = new int[arr.length + 1];
        
        for(int i = 0; i < arr.length; i ++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element;

        // print array using for each
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
