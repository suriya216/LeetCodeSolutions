class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int temp=0;
        for(int i=0;i<n;i++){
            sum-=nums[i];
            if(temp==sum){
                return i;
            }
            temp+=nums[i];
        }
        return -1;
    }
}