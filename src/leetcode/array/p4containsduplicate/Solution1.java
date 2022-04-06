package leetcode.array.p4containsduplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution1 implements Solution {

    @Override
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num: nums) {
            if (numsSet.contains(num))
                return true;
            numsSet.add(num);
        }
        return false;
    }
}
