package leetcode.dynprog.p3maxsubarray;

public class Solution3 implements Solution {
    @Override
    public int maxSubArray(int[] nums) {
        int sum = Math.max(nums[0], 0);
        int maxsum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            maxsum = Math.max(maxsum, sum);
            sum = Math.max(sum, 0);
        }
        return maxsum;
    }
}
