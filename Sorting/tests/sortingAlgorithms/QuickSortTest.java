package sortingAlgorithms;
import static org.junit.Assert.assertEquals;


import java.util.Arrays;

import org.junit.Test;


/**
 * Tests the QuickSort class
 * @author Robert Windisch
 *
 */
public class QuickSortTest extends SortTest{

	/**
	 * Test that the array gets properly sorted
	 */
	@Test
	public void testArray() {

		int[] testArray1 = { 2, 9, 7, 6, 5, 8 };
		int[] sortedArray1 = { 2, 5, 6, 7, 8, 9 };

		QuickSort.sort(testArray1);

		assertEquals(Arrays.toString(sortedArray1), Arrays.toString(testArray1));

	}

	/**
	 * Test that the file gets properly sorted
	 */
	@Test
	public void testSmallFile() {

		QuickSort.sort(testSmallFileArray);

		assertEquals(Arrays.toString(testSmallFileSortedArray), Arrays.toString(testSmallFileArray));

	}

	/**
	 * Test that the file gets properly sorted
	 */
	@Test
	public void testMediumFile() {

		QuickSort.sort(testMediumFileArray);

		assertEquals(Arrays.toString(testMediumFileSortedArray), Arrays.toString(testMediumFileArray));

	}

	/**
	 * Test that the file gets properly sorted
	 */
	@Test
	public void testLargeFile() {

		QuickSort.sort(testLargeFileArray);

		assertEquals(Arrays.toString(testLargeFileSortedArray), Arrays.toString(testLargeFileArray));

	}

}
