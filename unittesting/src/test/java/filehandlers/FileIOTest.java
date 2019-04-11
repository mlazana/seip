package filehandlers;

import org.junit.Test;

import org.junit.Assert;

public class FileIOTest {

	FileIO fileio = new FileIO();
    String src = "src/test/resources/";
    
	@Test
	public void test_readValidFile() {
		int[] validFile = { 1,2,3,4,5,6,7,8,9 };
		Assert.assertArrayEquals(validFile, fileio.readFile(src + "validFileInput.txt"));
	}
	
	@Test(expected = NumberFormatException.class)
	public void test_readInvalidFile() {
		fileio.readFile(src + "invalidFileInput.txt");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_readFile_invalidSrc() {
		fileio.readFile(src + "nonExist.txt");
	}
	
	
}
