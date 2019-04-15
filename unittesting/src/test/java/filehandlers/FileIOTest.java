package filehandlers;

import org.junit.Test;

import org.junit.Assert;

/**
 * This class contains tests for the methods of FileIO class
 * @author Marietta Lazana
 *
 */
public class FileIOTest {

	FileIO fileio = new FileIO();
    String src = "src/test/resources/";
    
    /**
     * Reads valid file
     * @param validFile the input array of integers
     * @return the array validFile 
     */
	@Test
	public void test_readValidFile() {
		int[] validFile = { 1,2,3,4,5,6,7,8,9 };
		Assert.assertArrayEquals(validFile, fileio.readFile(src + "validFileInput.txt"));
	}
	
	/**
	 * Reads invalid file
	 * @exception NumberFormatException when file contains 
	 * String 
	 */
	@Test(expected = NumberFormatException.class)
	public void test_readInvalidFile() {
		fileio.readFile(src + "invalidFileInput.txt");
	}
	
	/**
	 * Invalid given source path
	 * @exception IllegalArgumentException when the path for 
	 * source file is incorrect
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_readFile_invalidSrc() {
		fileio.readFile(src + "nonExist.txt");
	}
	
	
}
