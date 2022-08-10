package testing;

import org.junit.*;
import org.junit.Test;

public class AllAnnotate {

	@Test
	public void test1() {
		System.out.println("Test method1 called");
	}
	@Before
	public void testBefore() {
		System.out.println("Before method called");
	}
	@After
	public void testAfter() {
		System.out.println("After method called");
	}
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("Before class method called");
	}
	@AfterClass
	public static void testAfterClass() {
		System.out.println("After class method called");
	}
	@Ignore
	@Test
	public void test2() {
		System.out.println("Test2 method called");
	}

}
