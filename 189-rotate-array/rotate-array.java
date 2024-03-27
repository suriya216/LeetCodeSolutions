class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] temp = new int[k];    //Assuming temporary array for storing k size array elements to be rotate
        k=k%n; 
        //For the instance it just return the same 
        //It works effectively when K is greater than the size of array 
        for(int i=n-k;i<n;i++){
            temp[i-(n-k)]=nums[i];
            //Taking subarray with K size and stores it initially in temp array
        }
        for(int i=n-1;i>=k;i--){
            nums[i]=nums[i-k];
            //Storing array elements with i-k th position temp array
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
            //Restoring the temp array elements to original array
        }
    }
}