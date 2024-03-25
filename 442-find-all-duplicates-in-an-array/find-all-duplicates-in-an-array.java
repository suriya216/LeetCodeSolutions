class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int t=Math.abs(nums[i]);
            if(nums[t-1]<0){
                l.add(t);
            }else{
                nums[t-1]*=-1;
            }
        }
        return l;
    }
}