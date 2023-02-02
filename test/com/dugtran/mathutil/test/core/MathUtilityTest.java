package com.dugtran.mathutil.test.core;

import com.dugtran.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilityTest {

    // this a class use function of libraries/ framework JUnit to check main code - function getFactotial()
    // on class core.MathUnit
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell() {

        // set case input and expected output
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);

        // compare expected and actual value 
        Assert.assertEquals(expected, actual);

        Assert.assertEquals(1, MathUtility.getFactorial(1));
        Assert.assertEquals(2, MathUtility.getFactorial(2));
        Assert.assertEquals(6, MathUtility.getFactorial(3));
        Assert.assertEquals(24, MathUtility.getFactorial(4));
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        Assert.assertEquals(20, MathUtility.getFactorial(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowException() {
        MathUtility.getFactorial(-5);
    }

    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_LambdaVersion() {
        Assert.assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5));
    }

    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_TryCatch() {
        try {
            MathUtility.getFactorial(-5);
        } catch (Exception e) {
            Assert.assertEquals("The Argument is not valid!",  e.getMessage());
        }
    }

}
 