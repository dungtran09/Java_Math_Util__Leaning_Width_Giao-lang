
package com.dugtran.mathutil.test.core;

import com.dugtran.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathUtilityDDTTest {
    
    // this function returned dimention two-array pair (Expected and Input)
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][] {
                                    {0, 1},
                                    {1, 1},
                                    {2, 2},
                                    {3, 6},
                                    {4, 24},
                                    {5, 120},
        };
    }
    
    @Parameterized.Parameter(value = 0)
    public int n;
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell() {

        Assert.assertEquals(expected, MathUtility.getFactorial(n));
        
    }
    
}
