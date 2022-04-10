package leetcode.array.p8movezeros;

import org.junit.Assert;
import org.junit.Test;

public class MoveZerosTest {
    public Solution s = new Solution1();

    public void test(int[] input, int[] output) {
        s.moveZeroes(input);
        Assert.assertArrayEquals(output, input);
    }

    @Test
    public void zerosArrayUnchanged() {
        test(new int[] {0,0,0}, new int[]{0,0,0});
    }

    @Test
    public void firstZeroMoved() {
        test(new int[]{0,1}, new int[]{1,0});
    }

    @Test
    public void tailZeroHandled() {
        test(new int[]{1,0}, new int[]{1,0});
    }

    @Test
    public void manyZerosMovedToEnd() {
        test(new int[]{1,0,2,0,0,3,0,0,0,4}, new int[]{1,2,3,4,0,0,0,0,0,0});
    }

    @Test
    public void noZerosHandled() {
        test(new int[]{1,2,3,}, new int[]{1,2,3});
    }
}
