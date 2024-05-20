class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int res=0;
        if(n==2){
            if(nums[0]>nums[1]){
                res=0;
            }else{
                res=1;
            }
        }
        for(int i=1;i<n-1;i++){
            if(nums[n-1]>nums[i-1] && nums[n-1]>nums[res]){
                res=n-1;
            }
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                res=i;
            }
        }
        return res;
        // int l=0, r=n-1;
        // while(l<r){
        //     int mid=l+(r-l)/2;
        //     if(nums[mid]>nums[mid+1])   r=mid;
        //     else    l=mid+1;
        // }
        // return l;
    }
}