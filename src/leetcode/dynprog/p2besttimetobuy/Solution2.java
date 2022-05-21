package leetcode.dynprog.p2besttimetobuy;

public class Solution2 implements Solution {
    @Override
    public int maxProfit(int[] prices) {
        int maxPriceForRest = prices[prices.length - 1];
        int maxProfit = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            maxPriceForRest = Math.max(maxPriceForRest, prices[i]);
            maxProfit = Math.max(maxProfit, maxPriceForRest - prices[i]);
        }
        return maxProfit;
    }
}
