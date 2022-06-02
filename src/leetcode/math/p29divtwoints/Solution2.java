package leetcode.math.p29divtwoints;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution2 implements Solution {
    @Override
    public int divide(int dividend, int divisor) {
        int quotient = 0;

        // check case, where we cannot flip divisor to positive
        if (divisor == Integer.MIN_VALUE) {
            return dividend == Integer.MIN_VALUE ? 1 : 0;
        }

        boolean negDivisor = divisor < 0;
        divisor = negDivisor ? -divisor : divisor;
        Deque<Integer> chunk = new ArrayDeque<>();
        Deque<Integer> powers = new ArrayDeque<>();
        int biggerChunk = divisor, power = 1;

        if (dividend >= 0) {
            do {
                chunk.offerLast(biggerChunk);
                powers.offerLast(power);

                biggerChunk += biggerChunk;
                power += power;
            } while (biggerChunk > 0 && dividend >= biggerChunk);

            while (!chunk.isEmpty()) {

                if (dividend >= chunk.peekLast()) {
                    dividend -= chunk.peekLast();
                    quotient += powers.peekLast();
                } else {
                    chunk.pollLast();
                    powers.pollLast();
                }
            }
        } else {
            do {
                chunk.offerLast(biggerChunk);
                powers.offerLast(power);

                biggerChunk += biggerChunk;
                power += power;
            } while (biggerChunk > 0 && dividend <= -biggerChunk);

            while (!chunk.isEmpty()) {
                if (dividend <= -chunk.peekLast()) {
                    dividend += chunk.peekLast();
                    quotient -= powers.peekLast();
                } else {
                    chunk.pollLast();
                    powers.pollLast();
                }
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
