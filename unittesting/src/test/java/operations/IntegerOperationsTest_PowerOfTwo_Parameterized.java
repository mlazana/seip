package operations;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class IntegerOperationsTest_PowerOfTwo_Parameterized {
	
	@Parameter (value = 0)
	public int power;
	
	@Parameter (value = 1)
	public int result;
	
	IntegerOperations inop = new IntegerOperations();
	
	@Parameters
	publlic static Collection<Object[]>data(){
		Object[][] data = new Object[][] {{2,4},{}}
	}
	
	@Test
	public void test_powerOfTwo() {
		Assert.assertEquals(result, power);
	}
	
	
}
