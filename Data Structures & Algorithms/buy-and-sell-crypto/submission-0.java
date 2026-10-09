class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit;
        int max = 0;
        for(int i = 0;i < prices.length;i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(max , prices[i] - min);
            max = Math.max(max, profit);
        }
        return max;
    }
}
