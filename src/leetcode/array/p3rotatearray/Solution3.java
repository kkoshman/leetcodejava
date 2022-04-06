package leetcode.array.p3rotatearray;

import java.util.Arrays;

public class Solution3 implements Solution {
    @Override
    public void rotate(int[] nums, int k) {
        // {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14} 6
        int l = nums.length;
        k %= l;
        int temp, loopPrev, loopI, loopNext;
        int swapsLeft = l;

        int loopStart = 0;

        while (swapsLeft > 0) {

            loopI = loopStart;
            loopNext = inc(loopStart, k, l);
            temp = nums[loopStart];
            while (loopI != loopNext) {
                loopPrev = dec(loopI, k, l);

                nums[loopI] = nums[loopPrev];
                swapsLeft--;
                log(nums, swapsLeft);
                loopI = loopPrev;
            }
            nums[loopNext] = temp;
            swapsLeft--;
            log(nums, swapsLeft);

            loopStart++;
        }
    }

    private int dec(int value, int decrease, int cup) {
        int result = value - decrease;
        while (result < 0) {
            result += cup;
        }
        return result;
    }

    private int inc(int value, int increase, int cup) {
        int result = value + increase;
        while (result >= cup) {
            result -= cup;
        }
        return result;
    }

    private void log(int[] nums, int swapsLeft) {
        //System.out.println(Arrays.toString(nums) + "   " + swapsLeft);
    }
}
