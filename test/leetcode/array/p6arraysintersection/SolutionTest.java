package leetcode.array.p6arraysintersection;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class SolutionTest {
    public Solution s = new Solution1();

    protected void test(int[] in1, int[] in2, int[] out) {
        int[] result = s.intersect(in1, in2);
        Arrays.sort(result);
        Arrays.sort(out);
        Assert.assertArrayEquals(out, result);
    }

    @Test
    public void test1() {
        test(new int[]{2,2}, new int[]{1,2,2,1}, new int[]{2,2});
    }

    @Test
    public void test2() {
        test(new int[]{4,9,5}, new int[]{9,4,9,8,4}, new int[]{4,9});
    }

}
