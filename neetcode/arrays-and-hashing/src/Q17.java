public class Q17 {
    // Think about prefix and suffix sum
    // TC = O(3n) => O(n)
    // SC = O(2n) => O(n)
    class Solution {
        public int pivotIndex(int[] nums) {
            int n = nums.length;

            int[] leftSum = new int[n];
            leftSum[0] = nums[0];

            int[] rightSum = new int[n];
            rightSum[n - 1] = nums[n - 1];

            for (int i = 1; i < nums.length; i++)
                leftSum[i] = leftSum[i - 1] + nums[i];

            for (int i = n - 2; i >= 0; i--)
                rightSum[i] = rightSum[i + 1] + nums[i];

            for (int i = 0; i < n; i++) {
                if (leftSum[i] == rightSum[i])
                    return i;
            }

            return -1;
        }
    }
}
