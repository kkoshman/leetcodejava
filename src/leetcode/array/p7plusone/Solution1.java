package leetcode.array.p7plusone;

import java.util.Arrays;

public class Solution1 implements Solution {
    @Override
    public int[] plusOne(int[] digits) {
        int[] result;
        //checking all 999 case
        if (Arrays.stream(digits).allMatch(k -> k==9)) {
            result = new int[digits.length+1];
            result[0] = 1;
        } else {
            int position = digits.length - 1;
            result = Arrays.copyOf(digits, digits.length);
            while (result[position] == 9) {
                result[position] = 0;
                position--;
            }
            result[position] += 1;
        }
        return result;
    }
}
