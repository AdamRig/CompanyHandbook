package unit.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		// Arrange
	    final int expected = 4;

	    // Act
	    final int actual = Calculator.add(2, 2);

	    // Assert
	    assertEquals(actual, expected);
	}

	@Test
	public void testMultiply() {
		// Arrange
	    final int expected = 4;

	    // Act
	    final int actual = Calculator.multiply(2, 2);

	    // Assert
	    assertEquals(actual, expected);
	}

	@Test
	public void testDivide() {
		// Arrange
	    final int expected = 2;

	    // Act
	    final int actual = Calculator.divide(10, 5);

	    // Assert
	    assertEquals(actual, expected);
	}

}
