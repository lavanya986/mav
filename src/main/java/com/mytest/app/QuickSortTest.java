import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        // Define test cases: {input, expected_output}
        int[][] inputs = {
            {8, 7, 2, 1, 0, 9, 6}, // Standard
            {5, 4, 3, 2, 1},       // Reversed
            {1, 3, 2, 3, 1},       // Duplicates
            {42},                  // Single element
            {}                     // Empty
        };

        for (int[] testCase : inputs) {
            int[] original = testCase.clone();
            
            // Call your QuickSort method
            QuickSort.sort(testCase, 0, testCase.length - 1);
            
            // Verify using Java's built-in sort as a reference
            int[] expected = original.clone();
            Arrays.sort(expected);

            System.out.println("Input:    " + Arrays.toString(original));
            System.out.println("Result:   " + Arrays.toString(testCase));
            System.out.println(Arrays.equals(testCase, expected) ? "✅ PASS" : "❌ FAIL");
            System.out.println("---");
        }
    }
}
