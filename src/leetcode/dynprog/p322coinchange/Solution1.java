package leetcode.dynprog.p322coinchange;

import java.util.Arrays;

public class Solution1 implements Solution{
    @Override
    public int coinChange(int[] coins, int amount) {
        int[] memory = new int[amount+1];
        Arrays.fill(memory, -1);
        memory[0] = 0;
        int result = coinChange(coins, 0, amount, memory);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int coinChange(int[] coins, int startCoinIdx, int amount, int[] memory) {
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }
        if (memory[amount] >= 0) {
            return memory[amount];
        }
        if (startCoinIdx >= coins.length){
            return Integer.MAX_VALUE;
        }

        int withCoin = coinChange(coins, startCoinIdx, amount - coins[startCoinIdx], memory);
        if (withCoin < Integer.MAX_VALUE) {
            withCoin += 1;
        }
        int withoutCoin = coinChange(coins, startCoinIdx + 1, amount, memory);
        memory[amount] = Math.min(withCoin, withoutCoin);
        return memory[amount];
    }
}
