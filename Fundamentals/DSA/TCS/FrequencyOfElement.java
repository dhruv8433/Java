public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4 };
        int[] freq = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited; // mark the duplicate element increase default value
                }
            }

            // if it doens't have any duplicate than default value is 1
            if (freq[i] != visited) {
                freq[i] = count;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visited) {
                System.out.println("Frequency of " + arr[i] + " is " + freq[i]);
            }
        }
    }
    
}