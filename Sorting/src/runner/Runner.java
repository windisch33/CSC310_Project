package runner;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import sortingAlogrithms.HeapSort;
import sortingAlogrithms.MergeSort;
import sortingAlogrithms.QuickSort;

/**
 * @author Robert Windisch
 *
 */
public class Runner {


	static String file;

	private final static int small = 10000;
	private final static int medium = 100000;
	private final static int large = 1000000;

	private static PrintWriter writer = null;

	static int [] fileArray;

	private static long startTime;
	private static long totalTime;

	/**
	 * @param args
	 */
	public static void main(String[] args){

		try {
			writer = new PrintWriter("data_results.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			System.out.println("data_results file not created");
		} catch (UnsupportedEncodingException e) {
			System.out.println("UTF-8 not supported");
		}
		writer.println("File Name, HeapSort, MergeSort, QuickSort, ");

		//smallFile();
		//mediumFile();
		largeFile();
		writer.close();
	}

	/**
	 * 
	 */
	private static void largeFile() {

		fileArray = new int[large];

		System.out.println("Running Large_Unsorted files");
		for(int i = 1; i <= 30; i++)
		{
			file = "Large_Unsorted_" + i + ".txt";
			writer.print(file + ", ");

			heapRunner(file);
			mergeRunner(file);
			quickRunner(file);
			writer.print("\n");
		}

		System.out.println("Running Large_Sorted files");
		for(int i = 1; i <= 30; i++)
		{
			file = "Large_Sorted_" + i + ".txt";
			writer.print(file + ", ");

			heapRunner(file);
			mergeRunner(file);
			quickRunner(file);
			writer.print("\n");
		}

		System.out.println("Running Large_Reverse_Sort files");
		for(int i = 1; i <= 30; i++)
		{
			file = "Large_Reverse_Sort_" + i + ".txt";
			writer.print(file + ", ");

			heapRunner(file);
			mergeRunner(file);
			quickRunner(file);
			writer.print("\n");
		}

	}

	/**
	 * 
	 */
	private static void mediumFile() {

		fileArray = new int[medium];

		System.out.println("Running Medium_Unsorted files");
		for(int i = 1; i <= 30; i++)
		{
			file = "Medium_Unsorted_" + i + ".txt";
			writer.print(file + ", ");

			heapRunner(file);
			mergeRunner(file);
			quickRunner(file);
			writer.print("\n");
		}

		System.out.println("Running Medium_Sorted files");
		for(int i = 1; i <= 30; i++)
		{
			file = "Medium_Sorted_" + i + ".txt";
			writer.print(file + ", ");

			heapRunner(file);
			mergeRunner(file);
			quickRunner(file);
			writer.print("\n");
		}

		System.out.println("Running Medium_Reverse_Sort files");
		for(int i = 1; i <= 30; i++)
		{
			file = "Medium_Reverse_Sort_" + i + ".txt";
			writer.print(file + ", ");

			heapRunner(file);
			mergeRunner(file);
			quickRunner(file);
			writer.print("\n");
		}

	}

	/**
	 * 
	 */
	public static void smallFile()
	{
		fileArray = new int[small];

		System.out.println("Running Small_Unsorted files");
		for(int i = 1; i <= 30; i++)
		{
			file = "Small_Unsorted_" + i + ".txt";
			writer.print(file + ", ");

			heapRunner(file);
			mergeRunner(file);
			quickRunner(file);
			writer.print("\n");
		}

		System.out.println("Running Small_Sorted files");
		for(int i = 1; i <= 30; i++)
		{
			file = "Small_Sorted_" + i + ".txt";
			writer.print(file + ", ");

			heapRunner(file);
			mergeRunner(file);
			quickRunner(file);
			writer.print("\n");
		}

		System.out.println("Running Small_Reverse_Sort files");
		for(int i = 1; i <= 30; i++)
		{
			file = "Small_Reverse_Sort_" + i + ".txt";
			writer.print(file + ", ");

			heapRunner(file);
			mergeRunner(file);
			quickRunner(file);
			writer.print("\n");
		}
	}

	/**
	 * 
	 * @param file2
	 */
	private static void quickRunner(String file2) {
		
		System.out.println("Running Quick Sort on: " + file2);

		fileToArray(fileArray, file);
		startTime = System.nanoTime();
		QuickSort.sort(fileArray);
		totalTime = (System.nanoTime() - startTime);
		writer.print(totalTime + ", ");

	}

	/**
	 * 
	 * @param file2
	 */
	private static void mergeRunner(String file2) {
		
		System.out.println("Running Merge Sort on: " + file2);

		fileToArray(fileArray, file2);
		startTime = System.nanoTime();
		MergeSort.sort(fileArray);
		totalTime = (System.nanoTime() - startTime);
		writer.print(totalTime + ", ");

	}

	/**
	 * 
	 * @param file2
	 */
	private static void heapRunner(String file2) {

		System.out.println("Running Heap Sort on: " + file2);
		
		fileToArray(fileArray, file2);
		startTime = System.nanoTime();
		HeapSort.sort(fileArray);
		totalTime = (System.nanoTime() - startTime);
		writer.print(totalTime + ", ");

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
