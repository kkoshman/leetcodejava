package leetcode.array.p11rotateimage;

public class Solution1 implements Solution {
    @Override
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int rowBound = Math.floorDiv(n, 2);
        int colBound = -Math.floorDiv(-n, 2);//(int)Math.ceil(((double)n)/2);
        int tmp;
        for (int row = 0; row < rowBound; row++) {
            for (int col = 0; col < colBound; col++) {
                tmp = matrix[row][col];
                matrix[row][col] = matrix[n-1-col][row];
                matrix[n-1-col][row] = matrix[n-1-row][n-1-col];
                matrix[n-1-row][n-1-col] = matrix[col][n-1-row];
                matrix[col][n-1-row] = tmp;
            }
        }
    }
}
