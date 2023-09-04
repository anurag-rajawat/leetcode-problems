import java.util.HashMap;

public class Q20 {

    // TC = O(n)
    // SC = O(26 + 5) => O(1)
    class Solution {
        public int maxNumberOfBalloons(String text) {
            int res = text.length();
            var balloonCount = new HashMap<Character, Integer>();
            balloonCount.put('b', 1);
            balloonCount.put('a', 1);
            balloonCount.put('l', 2);
            balloonCount.put('o', 2);
            balloonCount.put('n', 1);
            int[] freq = new int[26];

            for (char ch : text.toCharArray()) {
                freq[ch - 'a']++;
            }
            for (char ch : balloonCount.keySet()) {
                res = Math.min(res, freq[ch - 'a'] / balloonCount.get(ch));
            }
            return res;
        }
    }

}