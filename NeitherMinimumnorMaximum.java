class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(min>nums[i])
                min=nums[i];
            if(max<nums[i])
                max=nums[i];
        }
        int nmm=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=min&&nums[i]!=max){
                nmm=nums[i];
                break;
            }
        }
        if(nums.length==1||nums.length==2)
            return -1;
        else
            return nmm;
    }
}
