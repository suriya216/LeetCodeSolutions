class Solution {
    private boolean isPossible(int []arr, int mid, int m){
        int c=1;
        int l=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-l>=mid){
                c++;
                l=arr[i];
            }
            if(c>=m){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1, r=position[position.length-1]-position[0];
        int ans=-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(position, mid, m)){
                ans=mid;
                l=mid+1;
            }
            else
                r=mid-1;
        }
        return ans;
    }
}