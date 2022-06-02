package leetcode.math.p29divtwoints;

import org.junit.Assert;
import org.junit.Test;

public class DivTwoIntsTest {
    public Solution s = new Solution2();

    protected void test(int dividend, int divisor, int expQuotient) {
        Assert.assertEquals(expQuotient, s.divide(dividend, divisor));
    }

    @Test
    public void dividesTwoPositive() {
        test(7, 3, 2);
    }

    @Test
    public void dividesTwoBigPositive() {
        test(7645638, 38, 201201);
    }

    @Test
    public void dividesWithNegativeDividend() {
        test(-7, 3, -2);
    }

    @Test
    public void dividesWithNegativeDivisor() {
        test(7, -3, -2);
    }

    @Test
    public void dividesBothNegatives() {
        test(-7, -3, 2);
    }

    @Test
    public void dividesPositiveWithZeroQuotient() {
        test(7, 8, 0);
    }

    @Test
    public void dividesNegative1WithZeroQuotient() {
        test(-7, 8, 0);
    }

    @Test
    public void dividesNegative2WithZeroQuotient() {
        test(7, -8, 0);
    }

    @Test
    public void dividesMinVal() {
        test(Integer.MIN_VALUE, 1, Integer.MIN_VALUE);
    }

    @Test
    public void dividesMinValuesByMinVal() {
        test(Integer.MIN_VALUE, Integer.MIN_VALUE, 1);
    }

    @Test
    public void dividesByMinVal() {
        test(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
    }

    @Test
    public void dividesToGetMaxVal() {
        test(Integer.MIN_VALUE, -1, Integer.MAX_VALUE);
    }
}
