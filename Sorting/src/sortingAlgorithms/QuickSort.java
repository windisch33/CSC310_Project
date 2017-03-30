package sortingAlgorithms;

import java.util.Arrays;

/**
 * A class the implements the quick sort algorithm
 * 
 * @author Robert Windisch
 */
public class QuickSort {

	public static void sort(int[] array) {
		QuickSort(array, 0, array.length - 1);
	}

	public static void QuickSort(int[] array, int lower, int upper) {

		if(lower < upper)
		{
			int median = calcMedian(array, lower, upper);
			int partition = partition(array, lower, upper, median );
			QuickSort(array, lower, partition - 1);
			QuickSort(array, partition + 1, upper);
		}
	}

	private static int calcMedian(int[] array, int lower, int upper) {
	
		return (array[lower]+array[upper])/2;
	}

	public static int partition(int[] array, int lower, int upper, int mid) {
		int less = lower;
		int pivot = 0;
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
		return less;
	}

	private static void swap(int[] array, int index, int index2) {
		int temp = array[index2];
		array[index2] = array[index];
		array[index] = temp;
	}

}
