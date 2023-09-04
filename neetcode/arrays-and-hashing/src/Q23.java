import java.util.Arrays;

public class Q23 {
    class MyHashMap {
        private final int[] map;

        public MyHashMap() {
            this.map = new int[(int) 1E6 + 1];
            Arrays.fill(this.map, -1);
        }

        public void put(int key, int value) {
            this.map[key] = value;
        }

        public int get(int key) {
            return this.map[key];
        }

        public void remove(int key) {
            this.map[key] = -1;
        }
    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
}
