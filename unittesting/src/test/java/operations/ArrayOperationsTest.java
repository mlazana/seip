package operations;

import org.junit.Assert;
import org.junit.Test;

import filehandlers.FileIO;
import static org.mockito.Mockito.*;

public class ArrayOperationsTest {
	ArrayOperations ao;

	@Test
	public void test_reverseArray_Mocking() {

		FileIO fileio = mock(FileIO.class);
		IntegerOperations io = mock(IntegerOperations.class);
        
		String src = "src/test/resources/validFileInput.txt" ;
        		
		int[] fileInput = {1,2,3,4,5};
		
		when(fileio.readFile(src)).thenReturn(fileInput);
		
		when(io.reverseSign(1)).thenReturn(-1);
		when(io.reverseSign(2)).thenReturn(-2);
		when(io.reverseSign(3)).thenReturn(-3);
		when(io.reverseSign(4)).thenReturn(-4);
		when(io.reverseSign(5)).thenReturn(-5);
		
		
		Assert.assertArrayEquals(new int[]{-1,-2,-3,-4,-5},
				ao.reverseArray(src));
		
	}

}
