class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int amt=money-(prices[0]+prices[1]);
        if(amt<0)
            return money;
        else
            return amt;
    }
}
