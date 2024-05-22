class Solution {
    public int maxArea(int[] height) {
        int i=0, j=height.length-1, area=-1;
        while(i<=j){
            if(height[i]<height[j]){
                area=Math.max(area, (j-i)*height[i]);
                i++;
            }else{
                area=Math.max(area, (j-i)*height[j]);
                j--;
            }
        }
    return area;
    }
}