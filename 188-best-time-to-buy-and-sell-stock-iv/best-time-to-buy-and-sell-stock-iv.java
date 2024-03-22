class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;        
        if (n == 0 || k == 0) {
            return 0;
        }
        int[] buyPrice = new int[k];
        int[] profit = new int[k];
        for (int i = 0; i < k; i++) {
            buyPrice[i] = Integer.MAX_VALUE;
            profit[i] = Integer.MIN_VALUE;
        }
        for (int price : prices) {
            for (int i = 0; i < k; i++) {
                buyPrice[i] = Math.min(buyPrice[i], price - (i > 0 ? profit[i - 1] : 0));
                profit[i] = Math.max(profit[i], price - buyPrice[i]);
            }

        }        
        return profit[k - 1];
    }
}