import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class WordCounterAndRandomStringGenerator {

    // Word Counter Function
    public int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        // Split text into words using whitespace as delimiter
        String[] words = text.split("\\s+");
        return words.length;
    }

    public int countOccurrences(String text, String word) {
        if (text == null || text.isEmpty() || word == null || word.isEmpty()) {
            return 0;
        }
        // Split text into words using whitespace as delimiter
        String[] words = text.split("\\s+");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }

    // Random String Generator Function
    public String generateRandomString(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive");
        }
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }
}
