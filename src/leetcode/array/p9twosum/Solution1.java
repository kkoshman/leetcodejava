package leetcode.array.p9twosum;

public class Solution1 implements Solution {
    @Override
    public int[] twoSum(int[] nums, int target) {
        int[] inx = new int[2];
        int j;
        boolean found = false;
        for (int i = 0; (i < nums.length - 1) && !found; i++) {
            for (j = i + 1; (j < nums.length) && !found; j++) {
                if (nums[i] + nums[j] == target) {
                    inx[0] = i;
                    inx[1] = j;
                    found = true;
                }
            }
        }
        return inx;
    }
}
