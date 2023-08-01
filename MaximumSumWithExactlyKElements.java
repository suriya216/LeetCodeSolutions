class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=nums[i]>max?nums[i]:max;
        }
        return max*k+k*(k-1)/2;
    }
}
