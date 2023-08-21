class Solution {
    public int[] leftRightDifference(int[] nums) {
        int []left=new int[nums.length];
        int []right=new int[nums.length];
        int n=nums.length,j=n-2;
        left[0]=0;
        right[n-1]=0;
        int sum=0;
        for(int i=1;i<n;i++){
            sum+=nums[i-1];
            left[i]=sum;
        }
        sum=0;
        for(int i=n-2;i>=0;i--){
            sum+=nums[i+1];
            right[j]=sum;
            j--;
        }
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}