class Solution {
    public boolean canJump(int[] nums) {
        //Traversing the array by reverse order to achieve the goal
        int lastPos=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            //Checking current position + current index greater than or equal to last position index
            if(i+nums[i]>=lastPos){
                lastPos=i;
            }
            //Unless last position remains the same
        }
        //return true if last position reaches 0-th index, otherwise false
        return lastPos==0;
    }
}