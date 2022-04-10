package leetcode.array.p8movezeros;

public class Solution1 implements Solution {
    @Override
    public void moveZeroes(int[] nums) {
        int writePointer = 0;
        int readPointer = 0;

        while (readPointer < nums.length) {
            if (nums[readPointer] != 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
            readPointer++;
        }

        while (writePointer < nums.length) {
            nums[writePointer++] = 0;
        }
    }
}
