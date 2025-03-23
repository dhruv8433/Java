public class MedianInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        // if the length of the array is even
        if (arr.length % 2 != 0) {
            System.out.println("Median: " + arr[arr.length / 2]);
        } else {
            // if the length of the array is even
            // (arr[5/1] + arr[5/2] )/ 2
            System.out.println("arr[arr.length / 2 - 1]: " + arr[arr.length / 2 - 1]);
            System.out.println("arr[arr.length / 2]: " + arr[arr.length / 2]); 
             
            System.out.println("Median: " + (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2);
        }
    }
}
