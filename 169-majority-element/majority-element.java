class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);  //Sort the array in ascending order
        int x=nums.length/2;    //Finding the middle index
        return nums[x]; //As per the concept number mus be occure n/2 times it will definitely takes place in middle index
    }
}