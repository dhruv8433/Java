// todo: leet code case 3

package Basic;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] resultPairs = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    resultPairs[0] = j;
                    resultPairs[1] = i;
                } 
            }
        }
        return resultPairs;

    }

    public static void main(String[] args) {
        TwoSum f = new TwoSum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 4;
        int[] arr = f.twoSum(nums, target);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
