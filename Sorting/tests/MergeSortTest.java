import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tests the MergeSort class
 * @author Robert Windisch
 *
 */
public class MergeSortTest {
	
	/**
	 * Test that the array gets properly sorted
	 */
	@Test
	public void testSort() {

		int[] testArray1 = { 52, 3, 6, 7, 1, 95, 16 };
		int[] sortedArray1 = { 1, 3, 6, 7, 16, 52, 95 };
		
		int[] testArray2 = { 22, 3, 857, 29, 26, 758, 322, 1561, 9999, 3 };
		int[] sortedArray2 = { 3, 3, 22, 26, 29, 322, 758, 857, 1561, 9999};
		
		int[] testArray3 = { 1, 3, 2, 4, 6, 5 };
		int[] sortedArray3 = { 1, 2, 3, 4, 5, 6 };

		MergeSort.sort(testArray1);
		MergeSort.sort(testArray2);
		MergeSort.sort(testArray3);

		assertEquals(Arrays.toString(sortedArray1), Arrays.toString(testArray1));
		assertEquals(Arrays.toString(sortedArray2), Arrays.toString(testArray2));
		assertEquals(Arrays.toString(sortedArray3), Arrays.toString(testArray3));
	}

}
