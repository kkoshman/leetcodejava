package leetcode.array.p9twosum;

import java.util.*;

public class Solution3 implements Solution {
    @Override
    public int[] twoSum(int[] nums, int target) {
        int[] idx = new int[2];

        Map<Integer, List<Integer>> idxMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            List<Integer> idxs;
            if (idxMap.containsKey(nums[i])) {
                idxs = idxMap.get(nums[i]);
            } else {
                idxs = new ArrayList<>();
                idxMap.put(nums[i], idxs);
            }
            idxs.add(i);
        }

        Iterator<Map.Entry<Integer, List<Integer>>> it = idxMap.entrySet().iterator();
        Map.Entry<Integer, List<Integer>> entry;
        int value;
        do {
            entry = it.next();
            value = entry.getKey();
            if (target == 2 * value) {
                if (entry.getValue().size() == 2) {
                    idx[0] = entry.getValue().get(0);
                    idx[1] = entry.getValue().get(1);
                    break;
                }
            } else if (idxMap.containsKey(target - value)) {
                idx[0] = entry.getValue().get(0);
                idx[1] = idxMap.get(target - value).get(0);
                break;
            }

        } while (it.hasNext());

        return idx;
    }
}
