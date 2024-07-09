class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n=customers.length;
        double tot=0;
        int t=customers[0][0];
        for(int [] c:customers){
            t=(t>=c[0]?t:c[0])+c[1];
            tot+=t-c[0];
        }
        return tot/n;
    }
}