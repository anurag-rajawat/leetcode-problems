public class Q4 {

    // TC = O(n)
    class Solution {
        public int[] replaceElements(int[] arr) {
            int len = arr.length;
            int max = Integer.MIN_VALUE;
            for (int i = len - 1; i >= 0; i--) {
                int curr = arr[i];
                arr[i] = max;
                max = Math.max(max, curr);
            }
            arr[len - 1] = -1;
            return arr;
        }
    }
}
