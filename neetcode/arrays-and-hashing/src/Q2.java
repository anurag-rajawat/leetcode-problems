import java.util.Arrays;

public class Q2 {

    // Approach 1: Sort chars of both strings and then compare each char.
    // TC = O(2(n log n)) => O(n log n)
    // SC = O(2n) => O(n)
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length())
                return false;
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
            Arrays.sort(sChars);
            Arrays.sort(tChars);

            for (int i = 0; i < s.length(); i++) {
                if (sChars[i] != tChars[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    // Approach 2: Count frequency of each number and check whether frequency of each char is equal.
    // TC = O(n)
    class Solution1 {

        // SC = O(1) (because 26 is constant)
        public boolean isAnagram1(String s, String t) {
            if (s.length() != t.length())
                return false;
            int[] freq = new int[26];

            for (char ch : s.toCharArray()) {
                int idx = ch - 'a';
                freq[idx]++;
            }

            for (char ch : t.toCharArray()) {
                int idx = ch - 'a';
                freq[idx]--;
            }

            for (int f : freq) {
                if (f != 0)
                    return false;
            }

            return true;
        }

        // Using single loop to count freq of each char
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length())
                return false;
            int[] freq = new int[26];

            for (int i = 0; i < s.length(); i++) {
                int sCharIdx = s.charAt(i) - 'a';
                int tCharIdx = t.charAt(i) - 'a';
                freq[sCharIdx]++;
                freq[tCharIdx]--;
            }

            for (int f : freq) {
                if (f != 0)
                    return false;
            }

            return true;
        }
    }

}
