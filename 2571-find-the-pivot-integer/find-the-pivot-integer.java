class Solution {
    public int pivotInteger(int n) {
        int a = (int)Math.sqrt((n*n + n)/2);
        if(2*a*a==n*n+n)
        return a;
        return -1;
    }
}