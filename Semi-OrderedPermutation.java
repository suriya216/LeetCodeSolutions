class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int min=51, max=0, pos1=0, pos2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                pos1=i;
            }
            if(nums[i]>max){
                max=nums[i];
                pos2=i;
            }
        }
        if(min==nums[0] && max==nums[nums.length-1]){
            return 0;
        }
        int count=0;
        if(pos1>pos2){
            count--;
        }
        count+=pos1+(nums.length-1-pos2);
        return count;
    }
}