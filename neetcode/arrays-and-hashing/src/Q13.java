import java.util.HashMap;

public class Q13 {

    // TC = SC = O(n) where n = len(s) = len(t)
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) return false;
            HashMap<Character, Character> freq = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (freq.containsKey(ch)) {
                    if (!freq.get(ch).equals(t.charAt(i))) {
                        return false;
                    }
                } else {
                    if (freq.containsValue(t.charAt(i))) {
                        return false;
                    }
                    freq.put(ch, t.charAt(i));
                }
            }
            return true;
        }
    }
}
