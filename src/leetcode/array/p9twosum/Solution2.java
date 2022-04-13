package leetcode.array.p9twosum;

import java.util.*;

public class Solution2 implements Solution {
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

        Arrays.sort(nums);

        int halfTarget = target / 2;
        for (int i = 0; i < nums.length - 1 && nums[i] <= halfTarget; i++) {
            idx[1] = Arrays.binarySearch(nums, i+1, nums.length,target - nums[i]);
            if (idx[1] > 0) {
                if (nums[i] == nums[idx[1]]) {
                    List<Integer> resultIdxs = idxMap.get(nums[i]);
                    idx[0] = resultIdxs.get(0);
                    idx[1] = resultIdxs.get(1);
                } else {
                    idx[0] = idxMap.get(nums[i]).get(0);
                    idx[1] = idxMap.get(nums[idx[1]]).get(0);
                }
                break;
            }
        }

        return idx;
    }
}
