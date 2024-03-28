class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;   //Initialize the variable to calculate profit
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                //Check whether the previous day is less than present day
                profit+=prices[i]-prices[i-1];
                //Then, calulate the profit by taking difference between them
            }
        }
        return profit;
    }
}