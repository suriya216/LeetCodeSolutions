class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int []arr = new int[n1+n2];
        int i=0,j=0;
        for(i=0;i<n1;i++){
            arr[j++]=nums1[i];
        }
        for(i=0;i<n2;i++){
            arr[j++]=nums2[i];
        }
        Arrays.sort(arr);
        if((n1+n2)%2 != 0){
            return (double)arr[(n1+n2)/2];
        }
        return (double)((arr[(arr.length/2)-1])+(arr[arr.length/2]))/2.0;
    }
}
