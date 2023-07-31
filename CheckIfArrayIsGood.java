class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int max=nums.length-1;
        for(int i=0;i<=max-1;i++){
            if(nums[i]!=i+1){
                return false;
            }
        }
        return nums[max]==max?true:false;
    }
}
