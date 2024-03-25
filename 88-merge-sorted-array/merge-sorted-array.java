class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1=m-1; //Length of nums1 including space for nums2 to add up
        int l2=n-1; //Length of nums2
        int len=m+n-1; //Total length of two arrays(nums1 & nums2)        
        while (l2>=0){ 
            //For iterating to the length of nums2 because it should be added to array (nums1)
            //Iterate in reverse way
            if(l1>=0&&nums1[l1]>nums2[l2]) {
                nums1[len--]=nums1[l1--];
                //Checking value in nums1 greater than nums2
            }else{
                nums1[len--]=nums2[l2--];
                //Vice versa of checking
            }
        }        
    }
}