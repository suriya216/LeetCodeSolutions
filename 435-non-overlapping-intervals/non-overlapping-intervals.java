class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[1]-b[1]);
        int k=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]>=k){
                k=intervals[i][1];
            }else{
                count++;
            }
        }
        return count;
    }
}