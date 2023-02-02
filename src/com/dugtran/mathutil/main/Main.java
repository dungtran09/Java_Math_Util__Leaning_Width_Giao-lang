
package com.dugtran.mathutil.main;

import com.dugtran.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        long expected = 120;
        int n = 5;
        long actual = MathUtility.getFactorial(n);
        System.out.println("Expected: " + n + "! = " + expected + '\n' + "Actual: " + n + "! = " + actual);
    }
}
