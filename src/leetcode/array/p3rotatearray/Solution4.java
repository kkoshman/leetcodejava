package leetcode.array.p3rotatearray;

public class Solution4 implements Solution {

    @Override
    public void rotate(int[] nums, int k) {
        // {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15} 6
        // {1,2,3,4,5,6,7,8,9, 10,11,12,13,14,15} flip part
        // {9,8,7,6,5,4,3,2,1, 10,11,12,13,14,15}
        // {9,8,7,6,5,4,3,2,1,10,11,12,13,14,15} flip whole
        // {15,14,13,12,11,10,1,2,3,4,5,6,7,8,9}
        // {15,14,13,12,11,10, 1,2,3,4,5,6,7,8,9} flip part
        // {10,11,12,13,14,15,1,2,3,4,5,6,7,8,9}


    }
}
