package leetcode.array.p7plusone;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {
    public Solution s = new Solution2();

    public void test(int[] input, int[] output) {
        Assert.assertArrayEquals(output, s.plusOne(input));
    }

    @Test
    public void addsLastDigit() {
        test(new int[]{1,2,3}, new int[]{1,2,4});
    }

    @Test
    public void carriesAdditionToNextDigit() {
        test(new int[]{4,3,2,9,9}, new int[]{4,3,3,0,0});
    }

    @Test
    public void increasesArrayFor999() {
        test(new int[]{9,9,9}, new int[]{1,0,0,0});
    }
}
