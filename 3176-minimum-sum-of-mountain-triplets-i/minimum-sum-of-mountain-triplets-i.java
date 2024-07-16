class Solution {
    public int minimumSum(int[] nums) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        boolean f=false;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[j]>nums[i] && nums[j]>nums[k]){
                        int val=nums[i]+nums[j]+nums[k];
                        res=Math.min(res, val);
                        f=true;
                    }
                }
            }
        }
        if(f){
            return res;
        }
        return -1;
    }
}