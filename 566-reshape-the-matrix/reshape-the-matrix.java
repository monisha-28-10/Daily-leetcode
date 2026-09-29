class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length, a[][] = new int[r][c], ct = 0;
        if(m*n != r*c){
            return mat;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[ct/c][ct%c] = mat[i][j];
                ct++;
            }
        }
        return a;
    }
}