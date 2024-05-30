class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
        LinkedList<int[]> list=new LinkedList<>();
        for(int[] interval:intervals){
            if(list.isEmpty()||list.getLast()[1]<interval[0]){
                list.add(interval);
            }else{
                list.getLast()[1]=Math.max(list.getLast()[1], interval[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}