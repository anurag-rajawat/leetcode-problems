import java.util.HashMap;

public class Q7 {
    // TC = SC = O(n)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] ans = {-1, -1};
            var indices = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                int key = target - nums[i];
                if (indices.containsKey(key)) {
                    return new int[]{i, indices.get(key)};
                }
                indices.put(nums[i], i);
            }
            return ans;
        }
    }

}
