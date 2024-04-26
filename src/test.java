import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CombinedTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-5);
        });
    }

    @Test
    public void testSortAscending() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 7, 1));
        List<Integer> sortedNumbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        ListSorter.sort(numbers);
        assertEquals(sortedNumbers, numbers);
    }

    @Test
    public void testSortDescending() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 7, 1));
        List<Integer> sortedNumbers = new ArrayList<>(Arrays.asList(7, 5, 3, 1));
        ListSorter.sortDescending(numbers);
        assertEquals(sortedNumbers, numbers);
    }
}

