package operations;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * This class contains tests for the methods of
 * IntegerOperation class
 * @author Marietta Lazana
 *
 */
public class IntegerOperationsTest {
	
    IntegerOperations io = new IntegerOperations();
	
    /**
     * Reverse sign for a positive number
     */
	@Test
	public void test_reverseSign_positive(){
		Assert.assertEquals(-1, io.reverseSign(1));
	}
	
	/**
	 * Reverse sign for a negative number
	 */
	@Test
	public void test_reverseSign_negative() {
		Assert.assertEquals(1, io.reverseSign(-1));
	}
	
	/**
	 * Reverse sign giving zero as an input
	 */
	@Test
	public void test_reverseSign_zero() {
		Assert.assertEquals(0, io.reverseSign(0));
	}
	
	/**
	 * Adds two positive numbers
	 */
	@Test
	public void test_add_positives() {
		Assert.assertEquals(3, io.add(1, 2));
	}
	
	/**
	 * Give two negative numbers
	 * @exception IllegalArgumentException when given input is negative
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_add_negatives() {
		io.add(-1,-1);
	}
	
	/**
	 * Give first number negative
	 * @exception IllegalArgumentException when first input is negative
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_add_first_negative() {
		io.add(-1,1);
	}
	
	/**
	 * Give first number negative
	 * @exception IllegalArgumentException when second input is negative
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_add_second_negative() {
		io.add(1,-1);
	}
	
	/**
	 * Give invalid input
	 * @exception IllegalArgumentException when input is invalid
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_add_overflow() {
		io.add(100,2147483647);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/**
	 * Give a negative number
	 * @exception IllegalArgumentException when input is invalid
	 */
	@Test
	public void test_powerOfTwo_negative() {
		thrown.expect(IllegalArgumentException.class);
		io.powerOfTwo(-1);
	}
	/**
	 * Give a number that causes overflow
	 * @exception IllegalArgumentException when input is invalid
	 */
	@Test
	public void test_powerOfTwo_overflow() {
		thrown.expect(IllegalArgumentException.class);
		io.powerOfTwo(50);
	}
	
}
