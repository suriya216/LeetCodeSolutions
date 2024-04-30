class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int bal=0;
        int val=0;
        for(int i=0;i<gas.length;i++){
            bal+=gas[i]-cost[i];
            if(bal<0){
                val+=bal;
                start=i+1;
                bal=0;
            }
        }
        if(bal+val>=0){
            return start;
        }
        return -1;
    }
}