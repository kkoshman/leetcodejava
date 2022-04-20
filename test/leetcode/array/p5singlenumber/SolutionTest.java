package leetcode.array.p5singlenumber;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    public Solution s = new Solution3();

    public void test(int[] nums, int singleNum) {
        Assert.assertEquals(s.singleNumber(nums), singleNum);
    }

    @Test
    public void test1() {
        test(new int[]{2,2,1}, 1);
    }

    @Test
    public void test2() {
        test(new int[]{4,1,2,1,2}, 4);
    }

    @Test
    public void test3() {
        test(new int[]{2}, 2);
    }

    @Test
    public void test4() {
        test(new int[]{1,-1,0,-1,1}, 0);
    }
}
