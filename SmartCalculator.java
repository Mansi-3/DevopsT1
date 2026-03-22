class SmartCalculator {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Division with exception
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Check even number
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Find max of two numbers
    public int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    // Factorial with exception
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative not allowed");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}