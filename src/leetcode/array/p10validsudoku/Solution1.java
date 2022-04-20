package leetcode.array.p10validsudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution1 implements Solution {
    @Override
    public boolean isValidSudoku(char[][] board) {
        boolean valid = true;
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i))
                return false;
            if (!isValidColumn(board, i))
                return false;
            if (!isValidBox(board, i/3, i%3)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidRow(char[][] board, int rowIndex) {
        Set<Character> set = new HashSet<>(9);
        for (int i = 0; i < 9; i++) {
            if (board[rowIndex][i] != EMPTY) {
                if (set.contains(board[rowIndex][i])) {
                    return false;
                } else {
                    set.add(board[rowIndex][i]);
                }
            }
        }
        return true;
    }

    private boolean isValidColumn(char[][] board, int columnIndex) {
        Set<Character> set = new HashSet<>(9);
        for (int i = 0; i < 9; i++) {
            if (board[i][columnIndex] != EMPTY) {
                if (set.contains(board[i][columnIndex])) {
                    return false;
                } else {
                    set.add(board[i][columnIndex]);
                }
            }
        }
        return true;
    }

    private boolean isValidBox(char[][] board, int boxRowIndex, int boxColIndex) {
        Set<Character> set = new HashSet<>(9);
        for (int i = 0; i < 9; i++) {
            Character value = board[3*boxRowIndex+i/3][3*boxColIndex+i%3];
            if (value != EMPTY) {
                if (set.contains(value)) {
                    return false;
                } else {
                    set.add(value);
                }
            }
        }
        return true;
    }
}
