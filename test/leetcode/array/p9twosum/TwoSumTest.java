package leetcode.array.p9twosum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class TwoSumTest {
    public Solution s;
    private int[] mInputArray;
    private int mTargetSum;
    private int[] mOutputIndexes;

    public TwoSumTest(int[] inputArray, int targetSum, int[] outputIndexes) {
        s = new Solution4();
        mInputArray = inputArray;
        mTargetSum = targetSum;
        mOutputIndexes = outputIndexes;
    }

    @Parameterized.Parameters
    public static Collection tests() {
        return Arrays.asList(new Object[][] {
                {new int[]{2,7,11,15}, 9, new int[]{0,1}},
                {new int[]{6,5,2,7,11,15}, 9, new int[]{2,3}},
                {new int[]{3,2,4}, 6, new int[]{1,2}},
                {new int[]{3,3}, 6, new int[]{0,1}},
                {new int[]{0,4,3,0}, 0, new int[]{0,3}}
        });
    }

    @Test
    public void test() {
        int[] result = s.twoSum(mInputArray, mTargetSum);
        Arrays.sort(result);
        Assert.assertArrayEquals(mOutputIndexes, result);
    }
}
