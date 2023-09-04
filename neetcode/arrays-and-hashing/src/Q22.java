public class Q22 {
    // NeetCode approach
    class MyHashSet {
        private ListNode[] set;

        public MyHashSet() {
            int size = (int) Math.pow(10, 4);
            this.set = new ListNode[size];
            for (int i = 0; i < size; i++) {
                this.set[i] = new ListNode(0);
            }
        }

        public void add(int key) {
            ListNode curr = this.set[key % this.set.length];
            while (curr.next != null) {
                if (curr.next.key == key) {
                    return;
                }
                curr = curr.next;
            }
            curr.next = new ListNode(key);
        }

        public void remove(int key) {
            ListNode curr = this.set[key % this.set.length];
            while (curr.next != null) {
                if (curr.next.key == key) {
                    curr.next = curr.next.next;
                    return;
                }
                curr = curr.next;
            }
        }

        public boolean contains(int key) {
            ListNode curr = this.set[key % this.set.length];
            while (curr.next != null) {
                if (curr.next.key == key) {
                    return true;
                }
                curr = curr.next;
            }
            return false;
        }

        private final class ListNode {
            private final int key;
            private ListNode next;

            public ListNode(int key) {
                this.key = key;
                this.next = null;
            }
        }

    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
