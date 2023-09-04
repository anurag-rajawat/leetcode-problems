public class Q5 {
    // TC = O(n)
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int sLen = s.length();
            int tLen = t.length();
            if (sLen > tLen)
                return false;
            if (s.isEmpty())
                return true;
            int i = 0;
            int j = 0;

            while (j < tLen) {
                if (i < sLen && s.charAt(i) == t.charAt(j)) {
                    i++;
                }
                j++;
            }
            return i == sLen;
        }
    }
}
