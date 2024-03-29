class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;  //Temporary variable holding upcoming place
        for(int i = 0; i < nums.length; i ++) {
           if(i > reachable) return false;
           //if current position is greater than the previously stored value then return false
           reachable = Math.max(reachable, i + nums[i]);
        } 
        //Unless less than or equal to the previous value, it returns true
       return true;
    }
}