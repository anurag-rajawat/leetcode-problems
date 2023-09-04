import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q1 {
    // Approach 1: Using map to count frequency of each number
    // TC = O(n)
    // SC = O(n)
    class Solution1 {
        public static boolean containsDuplicate(int[] nums) {
            if (nums.length == 1)
                return false;
            Map<Integer, Integer> freq = new HashMap<>();

            for (int num : nums) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
                if (freq.get(num) != null && freq.get(num) >= 2) {
                    return true;
                }
            }
            return false;
        }
    }

    // Approach 2: Using Set property (Better than previous solution)
    // TC = O(n)
    // SC = O(n)
    class Solution2 {
        public boolean containsDuplicate(int[] nums) {
            if (nums.length == 1)
                return false;
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (!set.add(num)) {
                    return true;
                }
            }
            return false;
        }
    }
}
