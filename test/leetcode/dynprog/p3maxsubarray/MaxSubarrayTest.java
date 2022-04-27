package leetcode.dynprog.p3maxsubarray;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MaxSubarrayTest {
    public Solution s = new Solution3();

    private int[] mNums;
    private int mExpSum;

    public MaxSubarrayTest(int[] nums, int expSum) {
        mNums = nums;
        mExpSum = expSum;
    }

    @Test
    public void test() {
        Assert.assertEquals(mExpSum, s.maxSubArray(mNums));
    }

    @Parameterized.Parameters
    public static Collection tests() {
        return Arrays.asList(new Object[][] {
                {new int[]{-2,1,-3,4,-1,2,1,-5,4}, 6},
                {new int[]{1}, 1},
                {new int[]{5,4,-1,7,8}, 23},
                {new int[]{-3,1,2,-1,3,1,-9,1,1,1}, 6},
                {new int[]{-8,-3,1,2,-1,3,1,-9,1,1,1}, 6},
                {new int[]{-1,-8}, -1}
        });
    }
}
