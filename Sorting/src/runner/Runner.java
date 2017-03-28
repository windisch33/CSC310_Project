package runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    writer.println("File Name, HeapSort, MergeSort, QuickSort, ");

		smallFile();
		writer.close();
	}
	
	public static void smallFile()
	{
		fileArray = new int[small];
		
		for(int i = 1; i <= 30; i++)
		{
			file = "Small_Unsorted_" + i + ".txt";
			writer.print(file + ", ");
			
			heapRunner(file);
			mergeRunner(file);
			quickRunner(file);
			writer.print("\n");
		}
		
		for(int i = 1; i <= 30; i++)
		{
			file = "Small_Sorted_" + i + ".txt";
			writer.print(file + ", ");
			
			heapRunner(file);
			mergeRunner(file);
			quickRunner(file);
			writer.print("\n");
		}
		
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

	private static void quickRunner(String file2) {
		
		fileToArray(fileArray, file);
		startTime = System.nanoTime();
		QuickSort.sort(fileArray);
		totalTime = (System.nanoTime() - startTime);
		writer.print(totalTime + ", ");
		
	}

	private static void mergeRunner(String file2) {
		
		fileToArray(fileArray, file2);
		startTime = System.nanoTime();
		MergeSort.sort(fileArray);
		totalTime = (System.nanoTime() - startTime);
		writer.print(totalTime + ", ");
		
	}

	private static void heapRunner(String file2) {
		
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
