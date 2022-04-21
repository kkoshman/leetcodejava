package leetcode.dynprog.p2besttimetobuy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BestTimeToBuyTest {
    public Solution s = new Solution1();

    private int[] mPrices;
    private int mExpProfit;

    public BestTimeToBuyTest(int[] prices, int expProfit) {
        mPrices = prices;
        mExpProfit = expProfit;
    }

    public void test(int[] prices, int expProfit) {
        Assert.assertEquals(expProfit, s.maxProfit(prices));
    }

    @Test
    public void test1() {
        test(mPrices, mExpProfit);
    }

    @Parameterized.Parameters
    public static Collection tests() {
        return Arrays.asList(new Object[][]{
                {new int[]{7,1,5,3,6,4}, 5},
                {new int[]{7,6,4,3,1}, 0},
                {new int[]{1,2},1},
                {new int[]{3,1,2},1}
        });
    }
}