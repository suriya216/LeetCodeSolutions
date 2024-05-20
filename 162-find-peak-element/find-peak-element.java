class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int i=0, j=n-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(nums[mid]>nums[mid+1]){
                j=mid;
            }else{
                i=mid+1;
            }
        }
        return i;
        // int l=0, r=n-1;
        // while(l<r){
        //     int mid=l+(r-l)/2;
        //     if(nums[mid]>nums[mid+1])   r=mid;
        //     else    l=mid+1;
        // }
        // return l;
    }
}