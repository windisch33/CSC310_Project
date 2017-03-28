package sortingAlogrithms;

import java.util.Arrays;

/**
 * A class that implements the HeapSort algorithm
 * @author Robert Windisch
 *
 */
public class HeapSort {

	private static int[] array;
	private static int parentIndex;
	private static int childIndex;
	private static int parent;

	/**
	 * Takes the input array and
	 * calls the appropriate methods
	 * @param inputArray the array to be sorted
	 */
	public static void sort(int[] inputArray) {

		array = inputArray;
		heapConstruction(array.length-1);
		//System.out.println(Arrays.toString(array));
		
		if(array.length > 1)
		{
			for(int i = array.length-1; i >= 0; i--)
			{
				moveLargest(i, 0);
				//System.out.println(Arrays.toString(array));
				heapify(i-1, 0);
				//System.out.println(Arrays.toString(array));
			}
		}
	}

	/**
	 * Moves the largest value to the last spot in the
	 * unsorted section
	 * @param index the index to move the largest value to
	 */
	private static void moveLargest(int index, int index2)
	{
		int temp = array[index2];
		array[index2] = array[index];
		array[index] = temp;
	}


	/**
	 * Constructs the heap portion of the array
	 * @param end the last index in the heap portion of the array
	 */
	public static void heapConstruction(int end)
	{

		for(int i = (end/2); i >= 0; i--)
		{
			heapify(end, i);
		}
	}

	private static void heapify(int end, int i) {
		
		boolean heap;
		parentIndex = i;
		parent = array[parentIndex];
		heap = false;

		while(!heap && 2*parentIndex < end)
		{

			childIndex = 2*parentIndex+1;


			if(childIndex < end)
			{
				if(array[childIndex] < array[childIndex +1])
				{
					childIndex = childIndex + 1;
				}
			}

			if(parent >= array[childIndex])
			{
				heap = true;
			}
			else
			{
				moveLargest(parentIndex,childIndex);
				heapify(end, childIndex);
			}

			
		}
	}
}

