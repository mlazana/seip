package operations;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class IntegerOperationsTest {
    IntegerOperations io = new IntegerOperations();
	
	@Test
	public void test_reverseSign_positive(){
		Assert.assertEquals(-1, io.reverseSign(1));
	}
	
	@Test
	public void test_reverseSign_negative() {
		Assert.assertEquals(1, io.reverseSign(-1));
	}
	
	@Test
	public void test_reverseSign_zero() {
		Assert.assertEquals(0, io.reverseSign(0));
	}
	
	@Test
	public void test_add_positives() {
		Assert.assertEquals(3, io.add(1, 2));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_add_negatives() {
		io.add(-1,-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_add_first_negative() {
		io.add(-1,1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_add_second_negative() {
		io.add(1,-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_add_overflow() {
		io.add(100,2147483647);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_powerOfTwo_negative() {
		thrown.expect(IllegalArgumentException.class);
		io.powerOfTwo(-1);
	}
	
	@Test
	public void test_powerOfTwo_overflow() {
		thrown.expect(IllegalArgumentException.class);
		io.powerOfTwo(50);
	}
	
}
