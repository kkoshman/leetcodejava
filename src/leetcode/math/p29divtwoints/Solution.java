package leetcode.math.p29divtwoints;

/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division, and
 * mod operator.
 * The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345
 * would be truncated to 8, and -2.7335 would be truncated to -2.
 *
 * -2^31 <= dividend, divisor <= 2^31 - 1
 * divisor != 0
 */

public interface Solution {
    int divide(int dividend, int divisor);
}
