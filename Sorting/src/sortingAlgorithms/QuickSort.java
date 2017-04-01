package sortingAlgorithms;

/**
 * A class the implements the quick sort algorithm
 * 
 * @author Robert Windisch
 */
public class QuickSort {

	/**
	 * Takes the array to be sorted
	 * 
	 * @param array
	 *            to be sorted
	 */
	public static void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	/**
	 * Takes the array and partitions it until sorted
	 * 
	 * @param array
	 *            to be sorted
	 * @param lower
	 *            bound of sorted section
	 * @param upper
	 *            bound of sorted section
	 */
	private static void quickSort(int[] array, int lower, int upper) {
		int median; 
		
		if (lower < upper + 1) {
			if(upper-lower > 145)
			{
				median = calcMedian(array, lower, upper);
			}else
			{
				median = array[lower];
			}
			int[] partitions = partition(array, lower, upper, median);
			quickSort(array, lower, partitions[0] - 1);
			quickSort(array, partitions[1] + 1, upper);
			
		}
		
	}

	/**
	 * Calculates median value to use as comparison for partitioning
	 * 
	 * @param array
	 * @param lower
	 *            bound of section of array to be sorted
	 * @param upper
	 *            bound of section of array to be sorted
	 * @return the median value
	 */
	private static int calcMedian(int[] array, int lower, int upper) {
		
			if(array[lower] < array[upper] && array[lower] > array[upper/2])
			{
				return array[lower];
			}
			if(array[lower] > array[upper] && array[lower] < array[upper/2])
			{
				return array[lower];
			}
			if(array[upper] < array[lower] && array[upper] > array[upper/2])
			{
				return array[upper];
			}if(array[upper] > array[lower] && array[upper] < array[upper/2])
			{
				return array[upper];
			}
		return array[upper/2];
	}

	/**
	 * Partitions the array into three sections lower values, equal values, and
	 * greater values
	 * 
	 * @param array
	 *            to be partitioned
	 * @param lower
	 *            bound of section to be partitioned
	 * @param upper
	 *            bound of section to be partitioned
	 * @param mid
	 *            value for comparison
	 * @return the lower and upper of the new sections
	 */
	private static int[] partition(int[] array, int lower, int upper, int mid) {
		int[] results = {0,0};
		int less = lower;
		int pivot = lower;
		int greater = upper;

		while (pivot <= greater) {
			if (array[pivot] < mid) {
				swap(array, less, pivot);
				less = less + 1;
				pivot = pivot + 1;
			} else if (array[pivot] > mid) {
				swap(array, pivot, greater);
				greater = greater - 1;
			} else {
				pivot = pivot + 1;
			}

		}

		results[0] = less;
		results[1] = greater;
		//System.out.println("Lower: " + less + " Upper: " + greater + " Mid:" + mid);
		return results;
	}

	/**
	 * Swaps to values in array
	 * 
	 * @param array
	 * @param index
	 *            of first value to be swapped
	 * @param index2
	 *            of second value to be swapped
	 */
	private static void swap(int[] array, int index, int index2) {
		int temp = array[index2];
		array[index2] = array[index];
		array[index] = temp;
	}

}
