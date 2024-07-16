class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(!s.add(nums[i])){
                res^=nums[i];
            }else{
                s.add(nums[i]);
            }
        }
        return res;
    }
}