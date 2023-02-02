
package com.dugtran.mathutil.core;

public class MathUtility {
    public static long getFactorial(int n) {
        
        // handel invalid input 
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("The Argument is not valid!");
        
        if (n == 0 || n == 1)
            return 1;
        
        return n * getFactorial(n - 1);
    } 
}
