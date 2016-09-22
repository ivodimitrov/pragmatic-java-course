package qa9.unit.test;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
	private Calculator calculator;
	private int a;
	private int b;
	
	@Before
	public void setup() {
		System.out.println("Before");
		calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please, provide a:");
		a = scanner.nextInt();
		System.out.println("Please, provide b:");
		b = scanner.nextInt();
	}
	
	@After
	public void cleanUp() {
		System.out.println("Cleaning up...");
	}
	
	@Test
	public void testSum() {
		System.out.println("testing sum");
		assertEquals("Sum is not correct", a + b, calculator.sum(a, b));
		assertNotEquals("Sum is not correct", a + b, calculator.diff(a, b));
	}
	
	@Test
	public void testDiff() {
		System.out.println("testing diff");
		assertEquals("Diff is not correct", a - b, calculator.diff(a, b));
	}
}