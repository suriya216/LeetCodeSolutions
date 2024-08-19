class Solution {
    public static void swap(int[] nums, int l, int r){
        int t=nums[l];
        nums[l]=nums[r];
        nums[r]=t;
    }
    public void moveZeroes(int[] nums) {
        int l=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                swap(nums, l, i);
                l++;
            }
        }
    }
}   