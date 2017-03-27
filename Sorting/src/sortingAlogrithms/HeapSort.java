package sortingAlogrithms;

/**
 * A class that implements the HeapSort algorithm
 * @author Robert Windisch
 *
 */
public class HeapSort {

	private static int[] array;

	/**
	 * Takes the input array and
	 * calls the appropriate methods
	 * @param inputArray the array to be sorted
	 */
	public static void sort(int[] inputArray) {

		array = inputArray;

		if(array.length > 1)
		{
			for(int i = array.length-1; i >= 0; i--)
			{
				heapConstruction(i);
				//System.out.println(Arrays.toString(array));
				moveLargest(i);
			}
		}
	}

	/**
	 * Moves the largest value to the last spot in the
	 * unsorted section
	 * @param index the index to move the largest value to
	 */
	private static void moveLargest(int index)
	{
		int temp = array[0];
		array[0] = array[index];
		array[index] = temp;
	}


	/**
	 * Constructs the heap portion of the array
	 * @param end the last index in the heap portion of the array
	 */
	public static void heapConstruction(int end)
	{
		boolean heap;

		for(int i = (end/2); i >= 0; i--)
		{
			int parentIndex = i;
			int parent = array[parentIndex];
			heap = false;

			while(!heap && 2*parentIndex < end)
			{
				int childIndex;

				if (parentIndex == 0 || parentIndex == 1)
				{
					childIndex = 2*parentIndex+1;
				}
				else
				{
					childIndex = 2*parentIndex;
				}

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
					array[parentIndex] = array[childIndex];
					parentIndex = childIndex;
				}

				array[parentIndex] = parent;
			}
		}
	}
}
