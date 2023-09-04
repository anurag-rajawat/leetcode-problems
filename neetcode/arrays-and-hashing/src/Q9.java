import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q9 {
    class Solution {
        // TC = O(n (m log m)) where m = len(s) and n = len(strs)
        // SC = O(n)
        public List<List<String>> groupAnagrams(String[] strs) {
            if (strs.length == 1 && strs[0].isEmpty()) {
                return new ArrayList<>();
            }
            var map = new HashMap<String, List<String>>();
            for (String s : strs) {
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                map.computeIfAbsent(key, k -> new ArrayList<>());
                map.get(key).add(s);
            }
            return new ArrayList<>(map.values());
        }
    }
}
