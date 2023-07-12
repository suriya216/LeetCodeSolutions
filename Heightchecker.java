class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=Arrays.copyOf(heights,heights.length);
        int c=0;
        Arrays.sort(arr);
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i])
                c++;
        }
        return c;
    }
}