package unit.testing;

public final class Calculator {
	

	    public static int add(int first, int second) {
	        return first + second;
	    }

	    public static int multiply(int a, int b) {
	        return a * b;
	    }

	    public static int divide(int dividend, int divisor) {
	        if (divisor == 0) {
	            throw new IllegalArgumentException("Cannot divide by zero (0).");
	        }
	        else {
	        return dividend / divisor;
	        }
	    }
}


