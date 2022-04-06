package leetcode.array.p6arraysintersection;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;

import java.util.Arrays;


public class SolutionTest {
    public Solution s;

    @BeforeTest
    public void setup() {
        s = new Solution1();
    }

    protected void test(int[] in1, int[] in2, int[] out) {
        int[] result = s.intersect(in1, in2);
        Arrays.sort(result);
        Arrays.sort(out);
        ArrayAsserts.assertArrayEquals(out, result);
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
