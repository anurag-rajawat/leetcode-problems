import java.util.HashMap;
import java.util.Map;

public class Q31 {
    // NeetCode oachappr
    public class Codec {
        private final Map<String, String> encodeMap;
        private final Map<String, String> decodeMap;

        public Codec() {
            this.encodeMap = new HashMap<>();
            this.decodeMap = new HashMap<>();
        }

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            if (encodeMap.get(longUrl) == null) {
                String shortUrl = "http://tinyurl.com" + encodeMap.size() + 1;
                encodeMap.put(longUrl, shortUrl);
                decodeMap.put(shortUrl, longUrl);
            }
            return encodeMap.get(longUrl);
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return decodeMap.get(shortUrl);
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
}
