class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        int []current=intervals[0];
        ArrayList<int[]> res=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=current[1]){
                current[1]=Math.max(current[1], intervals[i][1]);
            }else{
                res.add(new int[]{current[0], current[1]});
                current[0]=intervals[i][0];
                current[1]=intervals[i][1];
            }
        }
        res.add(new int[]{current[0], current[1]});
        return res.toArray(new int[res.size()][]);
    }
}