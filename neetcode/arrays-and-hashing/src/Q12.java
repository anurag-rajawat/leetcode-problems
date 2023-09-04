import java.util.HashMap;

public class Q12 {
    class Solution {
        // SC = O(n + m)
        // TC = O(n * m)
        // where n = len(emails) and m = len(email)
        public int numUniqueEmails(String[] emails) {
            var freq = new HashMap<String, Integer>();
            for (String email : emails) {
                String key = sanitize(email);
                freq.put(key, freq.getOrDefault(key, 0) + 1);
            }
            return freq.size();
        }

        private String sanitize(String email) {
            var sb = new StringBuilder();
            String[] parts = email.split("@");
            String local = parts[0];
            for (int i = 0; i < local.length(); i++) {
                if (local.charAt(i) == '.')
                    continue;
                if (local.charAt(i) == '+') {
                    while (i < local.length() && local.charAt(i) != '@')
                        i++;
                }
                if (i < local.length())
                    sb.append(local.charAt(i));
            }
            sb.append("@").append(parts[1]);
            return sb.toString();
        }
    }
}
