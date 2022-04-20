package leetcode.array.p11rotateimage;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RotateImageTest {
    public Solution s = new Solution1();

    public void test(int[][] matrix, int[][] expOutput) {
        System.out.println("Matrix before rotation:");
        System.out.println(Arrays.deepToString(matrix));
        s.rotate(matrix);
        System.out.println("Matrix after rotation:");
        System.out.println(Arrays.deepToString(matrix));

        System.out.println("Expected matrix:");
        System.out.println(Arrays.deepToString(expOutput) + "\n\n");
        Assert.assertTrue(Arrays.deepEquals(matrix, expOutput));
    }

    @Test
    public void test1() {
        test(new int[][]{{1}}, new int[][]{{1}});
    }


    @Test
    public void test2() {
        test(new int[][]{{1,2},{3,4}}, new int[][]{{3,1},{4,2}});
    }

    @Test
    public void test3() {
        test(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, new int[][]{{7,4,1},{8,5,2},{9,6,3}});
    }
}
