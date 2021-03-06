package leetcode.array.p4containsduplicate;

import org.junit.Assert;
import org.junit.Test;

class SolutionTest {
    public Solution s = new Solution2();

    void containsDuplicate(int[] nums, boolean expResult) {
        Assert.assertEquals(s.containsDuplicate(nums), expResult);
    }

    @Test
    public void containsDuplicate1() {
        containsDuplicate(new int[]{1, 2, 3, 1}, true);
    }

    @Test
    public void containsDuplicate2() {
        containsDuplicate(new int[]{1, 2, 3, 4}, false);
    }

    @Test
    public void containsDuplicate3() {
        containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true);
    }
}