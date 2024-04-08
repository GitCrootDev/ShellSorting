import org.example.ShellSort;

import org.junit.*;

import static org.junit.Assert.assertArrayEquals;


public class UnitTests {
    @Test
    public void NegativeNumbersTest() {
        int[] input = {-1,-5,-200,-100};
        ShellSort.sort(input);
        int[] expected = {-200,-100,-5,-1};
        assertArrayEquals(expected, input);
    }

    @Test
    public void SortedArray() {
        int[] input = {10,100,1000,10000};
        ShellSort.sort(input);
        int[] expected = {10,100,1000,10000};
        assertArrayEquals(expected, input);
    }

    @Test
    public void ReversedArray() {
        int[] input = {100,99,98,97};
        ShellSort.sort(input);
        int[] expected = {97,98,99,100};
        assertArrayEquals(expected, input);
    }

    @Test
    public void EmptyArray() {
        int[] input = {};
        ShellSort.sort(input);
        int[] expected = {};
        assertArrayEquals(expected, input);
    }
}
