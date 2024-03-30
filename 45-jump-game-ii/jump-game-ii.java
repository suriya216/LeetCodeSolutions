class Solution {
    public int jump(int[] nums) {
       int n = nums.length;
       int[] dp = new int[n];
       Arrays.fill(dp,10001);
       dp[0] = 0;
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<=nums[i]+i;j++)
           {
               if(j<n)
               {
                   dp[j] = Math.min(dp[j],1+dp[i]);
               }
               if(j==n-1)
               {
                   return dp[n-1];
               }
           }
       }
       return dp[n-1]; 
    }
}