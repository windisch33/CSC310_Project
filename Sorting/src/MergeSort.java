import java.util.Arrays;

/**
 * A class that implements MergeSort
 * @author Robert Windisch
 *
 */
public class MergeSort {
	
	private static int[] array;

	/**
	 * @param inputArray
	 */
	public static void sort(int[] inputArray) 
	{		
		array = inputArray;
		mergeSort(array);
	}

	/**
	 * 
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
			
			System.out.println(Arrays.toString(arrayA));
			System.out.println(Arrays.toString(arrayB));
			System.out.println(Arrays.toString(arrayC) + "\n");
			
			mergeSort(arrayB);
			mergeSort(arrayC);
			
			merge(arrayB,arrayC,arrayA);
		}

		
		
	}

	/**
	 * 
	 * @param arrayB
	 * @param arrayC
	 * @param arrayA
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
		
		if(indexB == arrayB.length-1)
		{
			for(int i = indexC; i < arrayC.length-1; i++)
			{
				arrayA[indexA] = arrayC[indexC];
				indexA++;
			}
		}else
		{
			for(int i = indexB; i < arrayB.length-1; i++)
			{
				arrayA[indexA] = arrayB[indexB];
				indexA++;
			}
		}
		
		System.out.println("Merged ArrayA: "+ Arrays.toString(arrayA)+"\n" );
		
	}
	
	

}
