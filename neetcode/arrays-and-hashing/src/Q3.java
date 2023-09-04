public class Q3 {
    // Just do what the question asked.
    // TC = O(n)
    // SC = O(1) because the question asked to return answer in new array and our algo hadn't taken any auxiliary space.
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];
            for (int i = 0; i < n; i++) {
                ans[i] = nums[i];
                ans[i + n] = nums[i];
            }
            return ans;
        }
    }
}
