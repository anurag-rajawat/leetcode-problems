import java.util.HashMap;

public class Q21 {
    // TC = O(n)
    // SC = O(n)
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            String[] words = s.split(" ");
            if (words.length != pattern.length())
                return false;

            var map = new HashMap<Character, String>();
            for (int i = 0; i < words.length; i++) {
                char key = pattern.charAt(i);
                String value = words[i];
                if (map.containsKey(key)) {
                    if (!map.get(key).equals(value))
                        return false;
                } else {
                    if (map.containsValue(words[i]))
                        return false;
                    map.put(key, value);
                }
            }
            return true;
        }
    }
}
