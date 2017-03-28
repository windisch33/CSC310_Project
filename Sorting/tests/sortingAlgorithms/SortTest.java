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
	
	private final String file = "testFile.txt";
	private final String fileSorted = "testFileSorted.txt";
	
	int[] testFileArray = new int [10000];
	int[] testFileSortedArray = new int [10000];

	/**
	 * Sets up arrays from test file before each test
	 */
	@Before
	public void setUp() {
		fileToArray(testFileArray, file);
		fileToArray(testFileSortedArray, fileSorted);
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
