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
	public void testArray() {

		int[] testArray1 = { 2, 9, 7, 6, 5, 8 };
		int[] sortedArray1 = { 2, 5, 6, 7, 8, 9 };

		MergeSort.sort(testArray1);

		assertEquals(Arrays.toString(sortedArray1), Arrays.toString(testArray1));

	}

	/**
	 * Test that the file gets properly sorted
	 */
	@Test
	public void testSmallFile() {

		MergeSort.sort(testSmallFileArray);

		assertEquals(Arrays.toString(testSmallFileSortedArray), Arrays.toString(testSmallFileArray));

	}

	/**
	 * Test that the file gets properly sorted
	 */
	@Test
	public void testMediumFile() {

		MergeSort.sort(testMediumFileArray);

		assertEquals(Arrays.toString(testMediumFileSortedArray), Arrays.toString(testMediumFileArray));

	}

	/**
	 * Test that the file gets properly sorted
	 */
	@Test
	public void testLargeFile() {

		MergeSort.sort(testLargeFileArray);

		assertEquals(Arrays.toString(testLargeFileSortedArray), Arrays.toString(testLargeFileArray));

	}

}
