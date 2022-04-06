package leetcode.array.p6arraysintersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 implements Solution {
    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersect = new ArrayList<>(1000);
        int[] nums1Sorted = Arrays.copyOf(nums1, nums1.length);
        Arrays.sort(nums1Sorted);
        int[] nums2Sorted = Arrays.copyOf(nums2, nums2.length);
        Arrays.sort(nums2Sorted);

        int i1 = 0, i2 = 0;
        while (i1 < nums1Sorted.length && i2 < nums2Sorted.length) {
            if (nums1Sorted[i1] == nums2Sorted[i2]) {
                intersect.add(nums1Sorted[i1]);
                i1++;
                i2++;
            } else if (nums1Sorted[i1] > nums2Sorted[i2]) {
                i2++;
            } else { //nums1Sorted[i1] < nums2Sorted[i2]
                i1++;
            }
        }
        return intersect.stream().mapToInt((i) -> i).toArray();
    }
}
