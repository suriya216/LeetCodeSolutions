class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;//Temporary value for storing index of the array element
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                //Comparing each value which is not equals to the "val"
                nums[index]=nums[i];
                index++;
            }
        }
        return index;//Returing recently pointing index
    }
}