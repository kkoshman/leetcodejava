package leetcode.dynprog.p322coinchange;

import java.util.Arrays;

public class Solution2 implements Solution {
    private static final int MAX_IMPOSSIBLE = 100000;

    @Override
    public int coinChange(int[] coins, int amount) {
        int[] memory = new int[amount+1];
        Arrays.fill(memory, MAX_IMPOSSIBLE);
        memory[0] = 0;

        for (int i = 0; i < amount; i++) {
            if (memory[i] == MAX_IMPOSSIBLE) {
                continue;
            }
            for (int coin : coins) {
                int newVal = coin + i;
                if (newVal <= amount && newVal >= 0) {
                    memory[newVal] = Math.min(memory[newVal], memory[i] + 1);
                }
            }
        }
        return memory[amount] == MAX_IMPOSSIBLE ? -1 : memory[amount];
    }
}
