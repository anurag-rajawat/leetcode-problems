public class Q18 {
    class NumArray {
        private int[] presum;

        public NumArray(int[] nums) {
            this.presum = new int[nums.length];
            this.presum[0] = nums[0];
            for (int i = 1; i < presum.length; i++) {
                this.presum[i] = presum[i - 1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            if (left == 0)
                return presum[right];
            return presum[right] - presum[left - 1];
        }
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
}
