package com.leetcode.array;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int max = 0;
        int profit = 0;
        int i = 0;
        for(int j = 1; j < prices.length; j++){
            if(prices[j] > prices[i]){
                profit = prices[j] -  prices[i];
                max = Math.max(max, profit);
            }else{
                i=j;
            }
        }
        return max;
    }
    public static void main(String[] args) {
	// write your code here
    }
}
