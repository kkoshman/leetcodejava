package leetcode.array.p3rotatearray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {

    private static Solution s = new Solution1();

    private void test(int[] inputArray, int k, int[] outputArray) {
        System.out.println("Input array: " + Arrays.toString(inputArray) +
                " rotating " + k);
        s.rotate(inputArray, k);
        System.out.println("Output array: \n" + Arrays.toString(inputArray) + "\n vs \n" +
                Arrays.toString(outputArray) + "\n=========================");
        Assertions.assertArrayEquals(outputArray, inputArray);
    }

    @Test
    public void test1() {
        test(new int[]{1,2,3,4,5,6,7}, 3, new int[]{5,6,7,1,2,3,4});
    }

    @Test
    public void test2() {
        test(new int[]{-1,-100,3,99}, 2, new int[]{3,99,-1,-100});
    }


    @Test
    public void test3() {
        int[] array = new int[]{1,2};
        s.rotate(array, 2);
        Assertions.assertArrayEquals(array, new int[]{1,2});
    }

    @Test
    public void test4() {
        test(new int[]{1,2,3,4,5,6}, 3, new int[]{4,5,6,1,2,3});
    }

    @Test
    public void test5() {
        test(new int[]{1,2,3,4,5,6}, 2, new int[]{5,6,1,2,3,4});
    }

    @Test
    public void test6() {
        test(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 6,
                new int[]{10,11,12,13,14,15,1,2,3,4,5,6,7,8,9});
        // 0-6-12-3-9-0
        // 1-7
    }
}
