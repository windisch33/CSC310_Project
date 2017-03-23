import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * Test the HeapSort class
 * 
 * @author Robert Windisch
 *
 */
public class HeapSortTest {

	/**
	 * Test that the array gets properly sorted
	 */
	@Test
	public void testSort() {
		int[] testArray = { 52, 3, 6, 7, 1, 95, 16 };
		int[] sortedArray = { 1, 3, 6, 7, 16, 52, 95 };

		HeapSort.sort(testArray);

		assertEquals(Arrays.toString(sortedArray), Arrays.toString(testArray));
	}
}
