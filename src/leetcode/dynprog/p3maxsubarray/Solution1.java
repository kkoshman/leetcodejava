package leetcode.dynprog.p3maxsubarray;

public class Solution1 implements Solution {
    @Override
    public int maxSubArray(int[] nums) {
        return maxsum(nums, 0 , nums.length);
    }

    private int maxsum(int[] nums, int start, int end) {
        if (start >= end)
            return Integer.MIN_VALUE;
        if (start + 1 == end) {
            return nums[start];
        }
        int middle = (start + end) / 2;
        int outerMax = Math.max(maxsum(nums, start, middle), maxsum(nums, middle+1, end));
        return Math.max(outerMax, maxsumWith(nums, start, end, middle));
    }

    private int maxsumWith(int[] nums, int start, int end, int with) {
        return nums[with] + maxRsum(nums, start, with - 1) + maxLsum(nums, with + 1, end - 1);
    }

    private int maxLsum(int[] nums, int start, int end) {
        int max = 0, sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
        }
        return max;
    }

    private int maxRsum(int[] nums, int start, int end) {
        int max = 0, sum = 0;
        for (int i = end; i >= start; i--) {
            sum += nums[i];
            max = Math.max(sum, max);
        }
        return max;
    }

}
