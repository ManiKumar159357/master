import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordCounterAndRandomStringGeneratorTest {

    @Test
    public void testCountWords() {
        WordCounterAndRandomStringGenerator wordCounter = new WordCounterAndRandomStringGenerator();
        assertEquals(3, wordCounter.countWords("Hello world Java"));
    }

    @Test
    public void testCountOccurrences() {
        WordCounterAndRandomStringGenerator wordCounter = new WordCounterAndRandomStringGenerator();
        assertEquals(2, wordCounter.countOccurrences("Java is fun. Java is cool.", "Java"));
    }

    @Test
    public void testGenerateRandomString() {
        WordCounterAndRandomStringGenerator generator = new WordCounterAndRandomStringGenerator();
        assertEquals(10, generator.generateRandomString(10).length());
    }

    @Test
    public void testGenerateRandomStringNonNull() {
        WordCounterAndRandomStringGenerator generator = new WordCounterAndRandomStringGenerator();
        assertNotNull(generator.generateRandomString(5));
    }
}

