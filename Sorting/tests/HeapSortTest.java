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
		
		int[] testArray1 = { 2, 9, 7, 6, 5, 8 };
		int[] sortedArray1 = { 2, 5, 6, 7, 8, 9 };
		
		int[] testArray2 = { 22, 3, 857, 29, 26, 758, 322, 1561, 9999, 3 };
		int[] sortedArray2 = { 3, 3, 22, 26, 29, 322, 758, 857, 1561, 9999};

		HeapSort.sort(testArray1);
		HeapSort.sort(testArray2);


		assertEquals(Arrays.toString(sortedArray1), Arrays.toString(testArray1));
		assertEquals(Arrays.toString(sortedArray2), Arrays.toString(testArray2));

	}
}
