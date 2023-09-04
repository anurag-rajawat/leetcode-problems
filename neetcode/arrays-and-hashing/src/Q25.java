import java.util.HashMap;
import java.util.PriorityQueue;

public class Q25 {
    // TC = O(n + n log k + k) => O(n log k)
    // SC = O(n + n) => O(n)
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            int[] ans = new int[k];
            var freq = new HashMap<Integer, Integer>();
            for (int num : nums) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            var minHeap = new PriorityQueue<Integer>(k, (a, b) -> freq.get(b) - freq.get(a));
            minHeap.addAll(freq.keySet());
            for (int i = 0; i < k; i++) {
                ans[i] = minHeap.poll();
            }
            return ans;
        }
    }
}
