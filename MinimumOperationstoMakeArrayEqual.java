class Solution {
    public int minOperations(int n) {
        int count=0;
        for(int i=0;i<n/2;i++){
            int num=(i*2)+1;
            count+=n-num;
        }
        return count;
    }
}
