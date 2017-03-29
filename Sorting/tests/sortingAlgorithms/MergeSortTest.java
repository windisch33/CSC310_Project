package sortingAlgorithms;
import static org.junit.Assert.assertEquals;


import java.util.Arrays;

import org.junit.Test;

import sortingAlgorithms.MergeSort;

/**
 * Tests the MergeSort class
 * @author Robert Windisch
 *
 */
public class MergeSortTest extends SortTest{
	
	/**
	 * Test that the array gets properly sorted
	 */
	@Test
	public void testSort() {

		int[] testArray1 = { 52, 3, 6, 7, 1, 95, 16 };
		int[] sortedArray1 = { 1, 3, 6, 7, 16, 52, 95 };
		
		MergeSort.sort(testArray1);
		MergeSort.sort(testSmallFileArray);
		MergeSort.sort(testMediumFileArray);
		MergeSort.sort(testLargeFileArray);


		assertEquals(Arrays.toString(sortedArray1), Arrays.toString(testArray1));
		assertEquals(Arrays.toString(testSmallFileSortedArray), Arrays.toString(testSmallFileArray));
		assertEquals(Arrays.toString(testMediumFileSortedArray), Arrays.toString(testMediumFileArray));
		assertEquals(Arrays.toString(testLargeFileSortedArray), Arrays.toString(testLargeFileArray));

	}

}
