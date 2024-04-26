import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Factorial calculation
        int n = 5;
        int factorial = FactorialCalculator.factorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);

        // Sorting a list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);

        System.out.println("Before sorting: " + numbers);

        ListSorter.sort(numbers);

        System.out.println("After sorting: " + numbers);
    }
}
