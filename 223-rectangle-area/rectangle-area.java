class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int l1 =ax2 - ax1;
        int h1 =ay2 - ay1;
        int l2 =bx2 - bx1;
        int h2=by2 - by1;

        int area1 = l1 * h1;
        int area2 = l2 * h2;

        int minl1 = Math.min(ax2, bx2);
        int maxl1 = Math.max(ax1, bx1);
        
        int minh1 = Math.min(ay2, by2);
        int maxh1 = Math.max(ay1, by1);
        
        int commonArea = Math.max(0,minl1 - maxl1) * Math.max(0, minh1 - maxh1);
        int res = area1 + area2 - commonArea;
        return res;
    }
}