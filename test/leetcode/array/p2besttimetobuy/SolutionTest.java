package leetcode.array.p2besttimetobuy;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private static Solution2 s = new Solution2();

    @Test
    public void test1() {
        int result = s.maxProfit(new int[]{7,1,5,3,6,4});
        Assert.assertEquals(result,7);
    }
    @Test
    public void test2() {
        int result = s.maxProfit(new int[]{1,2,3,4,5});
        Assert.assertEquals(result,4);
    }
    @Test
    public void test3() {
        int result = s.maxProfit(new int[]{7,6,4,3,1});
        Assert.assertEquals(result,0);
    }
}
