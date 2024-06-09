class Solution {
    public static int helper(int n, int r){
        int [][]dp=new int[n+1][r+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<r+1;j++){
                if(j==0){
                    dp[i][j]=1;
                }
                if(i==j){
                    dp[i][j]=1;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<r+1;j++){
                if(i>j){
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[n][r];
    }
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int []sum=new int[n];
        sum[0]=nums[0];
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
            sum[i]=((sum[i]%k)+k)%k;
        }
        int ans=0;
        Map<Integer, Integer> m=new HashMap<>();
        m.put(0,1);
        for(int i=0;i<n;i++){
            if(m.containsKey(sum[i])){
                m.put(sum[i], m.get(sum[i])+1);
            }else{
                m.put(sum[i], 1);
            }
        }
        for(int i:m.keySet()){
            if(m.get(i)>1){
                ans+=helper(m.get(i),2);
            }
        }
        return ans;
    }
}