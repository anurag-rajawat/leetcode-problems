import java.util.HashMap;
import java.util.Map;

public class Q16 {

    // TC = O(2(n * m)) => O(n * m) where n = len(num1) and m = len(nums2)
    // SC = O(n) due to map
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] ans = new int[nums1.length];
            var map = new HashMap<Integer, Integer>();
            populateMap(nums1, nums2, map);
            for (int i = 0; i < nums1.length; i++) {
                ans[i] = findNextGreaterElement(nums1[i], nums2, map.get(nums1[i]));
            }
            return ans;
        }

        private void populateMap(int[] nums1, int[] nums2, Map<Integer, Integer> map) {
            for (int num : nums1) {
                map.put(num, search(num, nums2));
            }
        }

        private int search(int target, int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target)
                    return i;
            }
            return -1;
        }

        private int findNextGreaterElement(int num, int[] nums, int idx) {
            for (int i = idx; i < nums.length; i++) {
                if (nums[i] > num)
                    return nums[i];
            }
            return -1;
        }
    }
}
