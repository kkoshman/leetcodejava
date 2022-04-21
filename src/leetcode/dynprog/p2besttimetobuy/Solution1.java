package leetcode.dynprog.p2besttimetobuy;

public class Solution1 implements Solution {
    @Override
    public int maxProfit(int[] prices) {
        int[] maxes = new int[prices.length];
        maxes[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            maxes[i] = Math.max(prices[i], maxes[i+1]);
        }
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            maxProfit = Math.max(maxes[i+1] - prices[i], maxProfit);
        }
        return maxProfit;
    }
}
