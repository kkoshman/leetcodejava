package leetcode.array.p7plusone;

public class Solution2 implements Solution {
    @Override
    public int[] plusOne(int[] digits) {
        int position = digits.length - 1;
        boolean hasAddition = true;
        while (hasAddition && position >= 0) {
            if (digits[position] == 9) {
                digits[position] = 0;
                position--;
            } else {
                digits[position] += 1;
                hasAddition = false;
            }
        }
        int[] result;
        if (hasAddition) {
            result = new int[digits.length + 1];
            result[0] = 1;
        } else {
            result = digits;
        }

        return result;
    }
}
