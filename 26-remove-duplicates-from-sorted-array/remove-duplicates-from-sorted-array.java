class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            //Comparing left neighbour value which are not same
            if(nums[i]!=nums[i-1]){
                //Shifting the current value with identified duplicate value
                nums[j]=nums[i];
                j++;
            }
        }
        return j;//Returning the index of the lastly pointed index
    }
}