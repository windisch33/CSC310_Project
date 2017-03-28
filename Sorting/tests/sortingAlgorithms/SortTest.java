package sortingAlgorithms;

import java.io.File;


import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Before;

/**
 * @author Robert Windisch
 *sets up the array from the test files
 *for testing
 */
public class SortTest {
	
	private final String fileSmall = "Small_Unsorted_Test.txt";
	private final String fileSmallSorted = "Small_Sorted_Test.txt";
	
	private final String fileMedium = "Medium_Unsorted_Test.txt";
	private final String fileMediumSorted = "Medium_Sorted_Test.txt";
	
	private final String fileLarge = "Large_Unsorted_Test.txt";
	private final String fileLargeSorted = "Large_Sorted_Test.txt";
	
	int[] testSmallFileArray = new int [10000];
	int[] testSmallFileSortedArray = new int [10000];
	
	int[] testMediumFileArray = new int [100000];
	int[] testMediumFileSortedArray = new int [100000];
	
	int[] testLargeFileArray = new int [1000000];
	int[] testLargeFileSortedArray = new int [1000000];

	/**
	 * Sets up arrays from test file before each test
	 */
	@Before
	public void setUp() {
		fileToArray(testSmallFileArray, fileSmall);
		fileToArray(testSmallFileSortedArray, fileSmallSorted);
		
		fileToArray(testMediumFileArray, fileMedium);
		fileToArray(testMediumFileSortedArray, fileMediumSorted);
		
		fileToArray(testLargeFileArray, fileLarge);
		fileToArray(testLargeFileSortedArray, fileLargeSorted);
	}
	
	
	/**
	 * takes file and copies it into an array
	 * 
	 * @param array
	 *            to fill with file content
	 * @param file
	 *            to be copied to array
	 */
	public static void fileToArray(int[] array, String file) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			System.out.println("File: " + file + " not found");
		}

		int i = 0;
		while (scanner.hasNextInt()) {
			array[i++] = scanner.nextInt();
		}
	}

}
