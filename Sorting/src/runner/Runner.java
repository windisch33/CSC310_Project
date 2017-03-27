package runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Robert Windisch
 *
 */
public class Runner {

	
	static String file = "testFile.txt";
	
	private final static int small = 10000;
	private final static int medium = 100000;
	private final static int large = 1000000;

	static int [] fileArray = new int[10];
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		long startTime = System.nanoTime();
		fileToArray(fileArray, file);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		fileToArray(fileArray, file);
		
		System.out.println("Took: " + duration);
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
