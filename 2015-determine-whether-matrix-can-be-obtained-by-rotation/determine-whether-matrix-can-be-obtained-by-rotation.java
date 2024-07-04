class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        int deg90=0, deg180=0, deg270=0, deg0=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(target[n-j-1][i]==mat[i][j]){
                    deg90++;
                }
                if(target[n-i-1][n-j-1]==mat[i][j]){
                    deg180++;
                }
                if(target[j][n-i-1]==mat[i][j]){
                    deg270++;
                }
                if(target[i][j]==mat[i][j]){
                    deg0++;
                }
            }
        }
        if(deg90==n*n||deg180==n*n||deg270==n*n||deg0==n*n){
            return true;
        }else{
            return false;
        }
    }
}