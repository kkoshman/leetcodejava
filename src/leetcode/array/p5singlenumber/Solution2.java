package leetcode.array.p5singlenumber;

import java.util.HashSet;
import java.util.Set;

public class Solution2 implements Solution {
    @Override
    public int singleNumber(int[] nums) {
        Set<Integer> counter = new HashSet<>();
        for (int num: nums) {
            if (counter.contains(num)) {
                counter.remove(num);
            } else {
                counter.add(num);
            }
        }
        return counter.iterator().next();
    }
}
