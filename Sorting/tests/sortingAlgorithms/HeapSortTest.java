package sortingAlgorithms;
import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

import sortingAlgorithms.HeapSort;

/**
 * Test the HeapSort class
 *
 * @author Robert Windisch
 *
 */
public class HeapSortTest extends SortTest{


	/**
	 * Test that the array gets properly sorted
	 */
	@Test
	public void testArray() {

		int[] testArray1 = { 2, 9, 7, 6, 5, 8 };
		int[] sortedArray1 = { 2, 5, 6, 7, 8, 9 };

		HeapSort.sort(testArray1);

		assertEquals(Arrays.toString(sortedArray1), Arrays.toString(testArray1));

	}

	/**
	 * Test that the file gets properly sorted
	 */
	@Test
	public void testSmallFile() {

		HeapSort.sort(testSmallFileArray);

		assertEquals(Arrays.toString(testSmallFileSortedArray), Arrays.toString(testSmallFileArray));

	}

	/**
	 * Test that the file gets properly sorted
	 */
	@Test
	public void testMediumFile() {

		HeapSort.sort(testMediumFileArray);

		assertEquals(Arrays.toString(testMediumFileSortedArray), Arrays.toString(testMediumFileArray));

	}

	/**
	 * Test that the file gets properly sorted
	 */
	@Test
	public void testLargeFile() {

		HeapSort.sort(testLargeFileArray);

		assertEquals(Arrays.toString(testLargeFileSortedArray), Arrays.toString(testLargeFileArray));

	}

}
