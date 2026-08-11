class Solution {
    public int numIslands(char[][] grid) {
        int c =0, m = grid.length, n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(grid, i, j, m, n);
                    c++;
                }
            }
        }
        return c;
    }
    static void dfs(char[][]g, int i, int j, int m, int n){
        if(i>=m || i<0 || j<0 || j>=n || g[i][j] == '0' ){
            return;
        }
        g[i][j] = '0';
        dfs(g, i+1,j,m,n);
        dfs(g, i-1,j,m,n);
        dfs(g, i,j+1,m,n);
        dfs(g, i,j-1,m,n);
    }
}