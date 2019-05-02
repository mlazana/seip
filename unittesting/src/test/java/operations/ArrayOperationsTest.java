package operations;

import org.junit.Assert;
import org.junit.Test;

import filehandlers.FileIO;
import static org.mockito.Mockito.*;

/**
 * This class contains tests for the methods of ArrayOperaions class
 * 
 * @author Marietta Lazana
 */
public class ArrayOperationsTest {

	String src = "src/test/resources/validFileInput.txt";
	
	// Mock the FileIO dependency
	FileIO fileio = mock(FileIO.class);
	// Mock the IntegerOperations dependency
	IntegerOperations io = mock(IntegerOperations.class);

	/**
	 * Finds max number within a given file by mocking FileIO and InegerOperation
	 * class
	 * 
	 * @param file the array with the given input
	 * @return max integer of the array
	 */
	@Test
	public void test_findMax() {

		ArrayOperations ao = new ArrayOperations(fileio, io);

		int[] file = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		when(fileio.readFile(src)).thenReturn(file);
		Assert.assertEquals(10, ao.findMaxInFile(src));

	}

	/**
	 * Reads empty file as an ipnut
	 * 
	 * @param emptyFile array without integers
	 * @exception IllegalArgumentException when file is empty
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_findMaxEmpty() {

		ArrayOperations ao = new ArrayOperations(fileio, io);

		int[] emptyFile = {};
		when(fileio.readFile(src)).thenReturn(emptyFile);

		ao.findMaxInFile(src);
	}

	/**
	 * Reverse a given array
	 * 
	 * @param fileInput an array with integers as input
	 * @result the reversed array
	 */
	@Test
	public void test_reverseArray_Mocking() {

		ArrayOperations ao = new ArrayOperations(fileio, io);

		int[] fileInput = { 1, 2, 3, 4, 5 };

		when(fileio.readFile(src)).thenReturn(fileInput);
		when(io.reverseSign(1)).thenReturn(-1);
		when(io.reverseSign(2)).thenReturn(-2);
		when(io.reverseSign(3)).thenReturn(-3);
		when(io.reverseSign(4)).thenReturn(-4);
		when(io.reverseSign(5)).thenReturn(-5);

		ao.reverseArray(src);

	}

	/**
	 * Empty array as an input
	 * 
	 * @exception IllegalArgumentException when the given array is empty
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_reverseArrayEmpty() {

		ArrayOperations ao = new ArrayOperations(fileio, io);

		when(fileio.readFile(src)).thenReturn(new int[] {});

		ao.reverseArray(src);
	}

}
