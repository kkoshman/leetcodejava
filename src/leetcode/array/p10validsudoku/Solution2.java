package leetcode.array.p10validsudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution2 implements Solution {
    @Override
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new Set[9];
        Set<Character>[] cols = new Set[9];
        Set<Character>[] boxes = new Set[9];
        int i, j;
        for (i = 0; i < 9; i++) {
            rows[i] = new HashSet<>(9);
            cols[i] = new HashSet<>(9);
            boxes[i] = new HashSet<>(9);
        }

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (checkRepeated(rows[i], board[i][j])) {
                    return false;
                }
                if (checkRepeated(cols[j], board[i][j])) {
                    return false;
                }
                if (checkRepeated(boxes[3*(i/3) + j/3], board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkRepeated(Set<Character> setToCheck, char value) {
        boolean repeat;
        if (value == EMPTY) {
            repeat = false;
        } else {
            if (setToCheck.contains(value)) {
                repeat = true;
            } else {
                setToCheck.add(value);
                repeat = false;
            }
        }
        return repeat;
    }
}
