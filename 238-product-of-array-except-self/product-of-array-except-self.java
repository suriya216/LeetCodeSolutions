class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int leftProduct=1, rightProduct=1;
        int []res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=leftProduct;
            leftProduct*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            res[i]*=rightProduct;
            rightProduct*=nums[i];
        }
        return res;
    }
}