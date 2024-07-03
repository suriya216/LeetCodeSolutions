class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totSum=(n*(n+1))/2;
        int digitSum=0;
        for(int i=0;i<n;i++){
            digitSum+=nums[i];
        }
        return totSum-digitSum;
    }
}