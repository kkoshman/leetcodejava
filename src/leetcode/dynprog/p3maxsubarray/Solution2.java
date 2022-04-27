package leetcode.dynprog.p3maxsubarray;

public class Solution2 implements Solution {
    @Override
    public int maxSubArray(int[] nums) {
        int[] maxSubArrEndingMe = new int[nums.length];
        maxSubArrEndingMe[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSubArrEndingMe[i] = Math.max(nums[i], maxSubArrEndingMe[i-1] + nums[i]);
        }
        int max = maxSubArrEndingMe[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, maxSubArrEndingMe[i]);
        }
        return max;
    }
}
