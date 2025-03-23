public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5};
        int min = arr[0];

        // loop through the array and compare it with min
        for(int i =0;i < arr.length;i++) {
            if(arr[i] < min) min = arr[i];
        }

        System.out.println("Smallest number: " + min);
    }
}
