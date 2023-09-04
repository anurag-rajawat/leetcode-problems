public class Q24 {
    // QuickSort
    class Solution {
        public int[] sortArray(int[] nums) {
            sort(nums, 0, nums.length - 1);
            return nums;
        }

        private void sort(int[] a, int low, int high) {
            if (low >= high) return;
            int start = low;
            int end = high;
            int mid = start + (end - start) / 2;
            int pivot = a[mid];
            while (start <= end) {
                while (a[start] < pivot) start++;
                while (a[end] > pivot) end--;
                if (start <= end) {
                    int x = a[start];
                    a[start] = a[end];
                    a[end] = x;
                    start++;
                    end--;
                }
            }
            sort(a, low, end);
            sort(a, start, high);
        }
    }
}
