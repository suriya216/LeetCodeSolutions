class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int max=0;
        int []dp=new int[n+1];
        for(int i=n-1;i>=0;i--){
            max=0;
            for(int j=i;j<Math.min(n, i + k);j++){
                max=Math.max(max, arr[j]);
                dp[i]=Math.max(dp[i], max*(j-i+1)+dp[j+1]);       
            }
        }
        return dp[0];
    }
}