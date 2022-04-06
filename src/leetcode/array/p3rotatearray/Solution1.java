package leetcode.array.p3rotatearray;

import java.util.Arrays;

/**
 * @author eikoshman
 */
public class Solution1 implements Solution {

    @Override
    public void rotate(int[] nums, int k) {
        if (k == 0 || nums.length == 1) {
            return;
        }
        int[] copyNums = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < nums.length; i++) {
            int newIdx = i + k;
            while (newIdx >= nums.length)
                newIdx -= nums.length;
            nums[newIdx] = copyNums[i];
        }
    }
}
