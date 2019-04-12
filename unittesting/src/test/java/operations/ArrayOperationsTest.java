package operations;

import org.junit.Assert;
import org.junit.Test;

import filehandlers.FileIO;
import static org.mockito.Mockito.*;

public class ArrayOperationsTest {

	String src = "src/test/resources/validFileInput.txt";

	@Test
	public void test_findMax() {

		FileIO fileio = mock(FileIO.class);
		IntegerOperations io = mock(IntegerOperations.class);

		ArrayOperations ao = new ArrayOperations(fileio, io);

		when(fileio.readFile(src)).thenReturn(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		Assert.assertEquals(10, ao.findMaxInFile(src));

	}

	@Test(expected = IllegalArgumentException.class)
	public void test_findMaxEmpty() {

		FileIO fileio = mock(FileIO.class);
		IntegerOperations io = mock(IntegerOperations.class);

		ArrayOperations ao = new ArrayOperations(fileio, io);
		when(fileio.readFile(src)).thenReturn(new int[] {});

		ao.findMaxInFile(src);
	}

	@Test
	public void test_reverseArray_Mocking() {

		FileIO fileio = mock(FileIO.class);
		IntegerOperations io = mock(IntegerOperations.class);
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
	
	@Test(expected = IllegalArgumentException.class)
	public void test_reverseArrayEmpty() {
		
		FileIO fileio = mock(FileIO.class);
		IntegerOperations io = mock(IntegerOperations.class);
		
		ArrayOperations ao = new ArrayOperations(fileio, io);
		when(fileio.readFile(src)).thenReturn(new int[] {});
		
		ao.reverseArray(src);
	}

}
