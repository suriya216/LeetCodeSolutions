class Solution {
    public static void helper(char[][] grid, int i, int j){
        int m=grid.length;
        int n=grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        helper(grid, i, j+1);
        helper(grid, i, j-1);
        helper(grid, i-1, j);
        helper(grid, i+1, j);
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    helper(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
}