package leetcode.array.p9twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution4 implements Solution {
    @Override
    public int[] twoSum(int[] nums, int target) {
        int[] idx = new int[2];
        Map<Integer, Integer> indexesMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indexesMap.containsKey(target - nums[i])) {
                idx[0] = i;
                idx[1] = indexesMap.get(target - nums[i]);
                break;
            }
            indexesMap.put(nums[i], i);
        }
        return idx;
    }
}
