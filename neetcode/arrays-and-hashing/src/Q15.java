import java.util.HashMap;

public class Q15 {
    // Approach 1: Using Hashmap
    // TC = SC = O(n)
    class Solution {
        public int majorityElement(int[] nums) {
            var freq = new HashMap<Integer, Integer>();
            for (int num : nums) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
            int times = (int) Math.floor(nums.length / 2);
            for (int num : nums) {
                if (freq.get(num) > times)
                    return num;
            }
            return -1;
        }
    }

    // Approach 2: Using Boyer-Moore voting algo
    // TC = O(n)
    // SC = O(1)
    class Solution2 {
        public int majorityElement(int[] nums) {
            int element = 0;
            int count = 0;
            for (int num : nums) {
                if (count == 0) {
                    element = num;
                    count = 1;
                } else if (num == element) {
                    count++;
                } else {
                    count--;
                }
            }
            return element;
        }
    }


}
