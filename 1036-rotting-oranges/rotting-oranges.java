class Solution {
    public static void helper(int [][] grid, int i, int j, int minutes){
        int m=grid.length;
        int n=grid[0].length;
        int count=-1;
        boolean f=true;
        if(i<0||j<0||i>=m||j>=n||grid[i][j]==0||(1<grid[i][j]&&grid[i][j]<minutes)){
            return;
        }
        grid[i][j]=minutes;
        helper(grid, i, j+1, minutes+1);
        helper(grid, i, j-1, minutes+1);
        helper(grid, i-1, j, minutes+1);
        helper(grid, i+1, j, minutes+1);
    }
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    helper(grid, i, j, 2);
                }
            }
        }
        int minutes=2;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return -1;
                }
                minutes=Math.max(minutes, grid[i][j]);
            }
        }
        return minutes-2;
    }
}