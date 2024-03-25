class Solution {
    public int removeDuplicates(int[] nums) {
        int i=2, j=2;   //Initializing variables for accessing nums array
        while(i<nums.length){
            if(nums[i]!=nums[j-2]){
                //Comparing i'th index and j-2'th were not same
                nums[j]=nums[i];
                j++;
                //Increment the j'th position accordingly
            }
            i++;
        }
        return j;   //Return the last visited index
    }
}