class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=neededTime.length;
        int res=0;
        int prev =0;
        for(int i=1;i<n;i++){
            if(colors.charAt(prev)==colors.charAt(i)){
                res+=Math.min(neededTime[prev], neededTime[i]);
                if(neededTime[prev]<neededTime[i]){
                    prev=i;
                }
            }else{
                prev=i;
            }
        }
        return res;
    }
}