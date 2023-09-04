import java.util.ArrayList;
import java.util.List;

public class Q19 {

    // Cyclic sort
    // TC = O(n)
    // SC = O(1)
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < nums.length;) {
                int correctIdx = nums[i] - 1;
                if (nums[i] != nums[correctIdx]) {
                    swap(nums, i, correctIdx);
                } else {
                    i++;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i + 1)
                    ans.add(i + 1);
            }

            return ans;
        }

        private void swap(int[] nums, int i, int j) {
            int curr = nums[i];
            nums[i] = nums[j];
            nums[j] = curr;
        }
    }
}
