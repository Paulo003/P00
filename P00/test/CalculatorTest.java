import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Paulo Diaz
 * Student ID: 21009874
 * Class: W64N
 * Date/Time created: Friday 27-05-2022 12:04
 */

/**
 * @author paulo
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,  b);
		
		int expected = 5555;
		assertEquals (expected,actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4231;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5645;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testMultiple() {
		int a = 9876;
		int b = 4231;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 41785356;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testDivide() {
		int a = 6;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 3;
		assertEquals(expected, actual);
	}

}
