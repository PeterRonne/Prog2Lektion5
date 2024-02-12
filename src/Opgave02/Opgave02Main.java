package Opgave02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Opgave02Main {
private static long[] fibonacciStorage;
    public static void main(String[] args) {
        int n = 92;
        fibonacciStorage = new long[n + 1];

        System.out.println(fibonacci(10));
        System.out.println(Arrays.toString(fibonacciStorage));
    }
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        if (fibonacciStorage[n] != 0) {
            return (int) fibonacciStorage[n];
        }

        int nthFibonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciStorage[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}
