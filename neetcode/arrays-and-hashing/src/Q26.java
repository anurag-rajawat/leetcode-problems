public class Q26 {
    // Think about prefix and suffix product
    // TC = O(3n) => O(n)
    // SC = O(2n) => O(n)
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];

            int[] pre = new int[n];
            int[] suff = new int[n];
            pre[0] = suff[n - 1] = 1;

            for (int i = 1; i < n; i++) {
                pre[i] = pre[i - 1] * nums[i - 1];
            }

            for (int i = n - 2; i >= 0; i--) {
                suff[i] = suff[i + 1] * nums[i + 1];
            }

            for (int i = 0; i < n; i++) {
                ans[i] = pre[i] * suff[i];
            }

            return ans;
        }
    }

    // NeetCode Approach
    // TC = O(n)
    // SC = O(1)
    class Solution2 {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];
            int pre = 1;
            int post = 1;

            for (int i = 0; i < n; i++) {
                ans[i] = pre;
                pre *= nums[i];
            }

            for (int i = n - 1; i >= 0; i--) {
                ans[i] *= post;
                post *= nums[i];
            }

            return ans;
        }
    }

}
