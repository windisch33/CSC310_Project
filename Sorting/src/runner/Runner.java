package runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import sortingAlogrithms.HeapSort;
import sortingAlogrithms.MergeSort;
import sortingAlogrithms.QuickSort;

/**
 * @author Robert Windisch
 *
 */
public class Runner {


	static String file = "testFile.txt";

	private final static int small = 10000;
	private final static int medium = 100000;
	private final static int large = 1000000;

	private final static HeapSort heap = new HeapSort();
	private final static MergeSort merge = new MergeSort();
	private final static QuickSort quick = new QuickSort();

	static int [] fileArray = new int[10];
	/**
	 * @param args
	 */
	public static void main(String[] args){

		fileToArray(fileArray, file);
		System.out.println(Arrays.toString(fileArray));

		long startTime = System.nanoTime();
		heap.sort(fileArray);
		long endTime = System.nanoTime();
		long totalTime = (endTime - startTime);

		System.out.println(Arrays.toString(fileArray));
		System.out.println("Took: " + totalTime + "ns");
	}

	/**
	 * @param array
	 * @param file
	 */
	public static void fileToArray(int [] array, String file)
	{
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			System.out.println("File: " + file + " not found");
		}

		int i = 0;
		while(scanner.hasNextInt())
		{
		     array[i++] = scanner.nextInt();
		}

	}
}
