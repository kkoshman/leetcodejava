package leetcode.math.p29divtwoints;

public class Solution1 implements Solution {
    @Override
    public int divide(int dividend, int divisor) {
        int quotient = 0;

        // check case, where we cannot flip divisor to positive
        if (divisor == Integer.MIN_VALUE) {
            return dividend == Integer.MIN_VALUE ? 1 : 0;
        }

        boolean negDivisor = divisor < 0;
        divisor = negDivisor ? -divisor : divisor;

        if (dividend >= 0) {
            while (dividend >= divisor) {
                dividend -= divisor;
                quotient += 1;
            }
        } else {
            while (dividend <= -divisor) {
                dividend += divisor;
                quotient -= 1;
            }
        }

        if (negDivisor) {
            if (quotient == Integer.MIN_VALUE) {
                quotient = Integer.MAX_VALUE;
            } else {
                quotient = -quotient;
            }
        }
        return quotient;
    }
}
