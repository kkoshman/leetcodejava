package leetcode.dynprog.p322coinchange;

import java.util.Arrays;

public class Solution1 implements Solution{
    @Override
    public int coinChange(int[] coins, int amount) {
        int[] memory = new int[amount+1];
        Arrays.fill(memory, -1);
        memory[0] = 0;
        int result = coinChange(coins, 0, amount, memory);

        return result >= MAX_IMPOSSIBLE ? -1 : result;
    }
    private static final int MAX_IMPOSSIBLE = 100000;
    private int coinChange(int[] coins, int startCoinIdx, int amount, int[] memory) {
        if (amount < 0) {
            return MAX_IMPOSSIBLE;
        }
        if (memory[amount] >= 0) {
            return memory[amount];
        }
        if (startCoinIdx >= coins.length){
            return MAX_IMPOSSIBLE;
        }

        int withCoin = coinChange(coins, startCoinIdx, amount - coins[startCoinIdx], memory);
        if (withCoin < MAX_IMPOSSIBLE) {
            withCoin += 1;
        }
        int withoutCoin = coinChange(coins, startCoinIdx + 1, amount, memory);
        memory[amount] = Math.min(withCoin, withoutCoin);
        System.out.print("m[" + amount + "]=" + memory[amount] + "   ");
        return memory[amount];
    }
}
