package leetcode.array.p2besttimetobuy;

import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        int index = 0; // start of increase
        int profit = 0;
        while (index < prices.length - 1) {
            int lowPoint = findLowestPriceIndex(prices, index);
            if (lowPoint < prices.length) {
                int highPoint = findHighestPriceIndex(prices, lowPoint);
                profit += prices[highPoint] - prices[lowPoint];
                index = highPoint;
            }
        }
        return profit;
    }

    private int findLowestPriceIndex(int[] prices, int start) {
        System.out.println("findLowestPriceIndex with " + Arrays.toString(prices) + " and " + start);
        while ((start + 1 < prices.length) &&
                (prices[start] >= prices[start+1])) {
            start++;
        }
        System.out.println("low point is " + start);
        return start;
    }


    private int findHighestPriceIndex(int[] prices, int start) {
        System.out.println("findHighestPriceIndex with " + Arrays.toString(prices) + " and " + start);
        while ((start + 1 < prices.length) &&
                (prices[start] <= prices[start+1])) {
            start++;
        }
        System.out.println("high point is " + start);
        return start;
    }
}
