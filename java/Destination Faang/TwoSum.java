import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement exists
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current number with index
            map.put(nums[i], i);
        }

        return new int[] {}; // no solution case
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 3};
        int target = 14;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);
    }
}
