public class Mean {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,5,6};
        int sum = 0;
        double mean = 0.0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // find avg
        mean = (double) sum / arr.length;
        System.out.println("Mean: " + mean);
    }
}
