package operations;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test class for IntegerOpertions class tha runs for 
 * multiple input values
 * @author Marietta Lazana
 *
 */
@RunWith(Parameterized.class)
public class IntegerOperationsTest_PowerOfTwo_Parameterized {
	
	@Parameter (value = 0)
	public int power;
	
	@Parameter (value = 1)
	public int result;
	
	IntegerOperations inop = new IntegerOperations();
	
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data = new Object[][]{{2,4},{3,8},{4,16}};
		
		return Arrays.asList(data);
	}
	/**
	 * @return the power of two of a number
	 */
	@Test
	public void test_powerOfTwo() {
		Assert.assertEquals(result, inop.powerOfTwo(power));
	}
	
}
