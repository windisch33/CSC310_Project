package sortingAlogrithms;

/**
 * A class that implements MergeSort
 * @author Robert Windisch
 *
 */
public class MergeSort {

	private static int[] array;

	/**
	 * takes the array to be sorted
	 * @param inputArray the array to be sorted
	 */
	public static void sort(int[] inputArray)
	{
		array = inputArray;
		mergeSort(array);
	}

	/**
	 * takes an array and copies half of it
	 * to array b and half to array c
	 * sends b and c to merge sort until arrays are length 1
	 * then calls merge method on the three arrays
	 * @param arrayA the array to be split
	 */
	private static void mergeSort(int [] arrayA) {

		int [] arrayB;
		int [] arrayC;

		arrayB = new int[(arrayA.length/2)];
		if(arrayA.length%2 == 0)
		{
			arrayC = new int[(arrayA.length/2)];
		}else
		{
			arrayC = new int[(arrayA.length/2)+1];
		}

		if(arrayA.length > 1)
		{
			for(int i = 0; i <= ((arrayA.length/2)-1); i++)
			{
				arrayB[i] = arrayA[i];
			}

			int cIndex = 0;
			for(int i = arrayA.length/2; i <= arrayA.length-1; i++)
			{
				arrayC[cIndex] = arrayA[i];
				cIndex++;
			}

			//System.out.println("Array A: " + Arrays.toString(arrayA));
			//System.out.println("Array B: " + Arrays.toString(arrayB));
			//System.out.println("Array C: " + Arrays.toString(arrayC));

			mergeSort(arrayB);
			mergeSort(arrayC);

			merge(arrayB,arrayC,arrayA);
		}
	}

	/**
	 * merges the three arrays into
	 * ascending order
	 * @param arrayB the first smaller array
	 * @param arrayC the second smaller array
	 * @param arrayA the target array
	 */
	private static void merge(int[] arrayB, int[] arrayC, int[] arrayA) {

		int indexA = 0;
		int indexB = 0;
		int indexC = 0;

		while(indexB <= arrayB.length-1 && indexC <= arrayC.length-1)
		{
			if(arrayB[indexB] <= arrayC[indexC])
			{
				arrayA[indexA] = arrayB[indexB];
				++indexB;
			}else
			{
				arrayA[indexA] = arrayC[indexC];
				++indexC;
			}

			++indexA;
		}

		//add array not completed to end of array a
		if(indexB == arrayB.length)
		{
			for(int i = indexC; i <= arrayC.length-1; i++)
			{
				arrayA[indexA] = arrayC[i];
				indexA++;
			}
		}else
		{
			for(int i = indexB; i <= arrayB.length-1; i++)
			{
				arrayA[indexA] = arrayB[i];
				indexA++;
			}
		}

		//System.out.println("Merged Array A: " + Arrays.toString(arrayA));
	}
}
