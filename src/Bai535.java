import java.util.HashMap;
import java.util.Map;

public class Bai535 {
    public static void main(String[] args) {

    }

    static Map<String, String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        map.put("http://tinyurl.com/"+longUrl.hashCode(), longUrl);
        return "http://tinyurl.com/"+longUrl.hashCode();
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
