class Solution {
    public int orangesRotting(int[][] grid) {
        int f = 0,min = 0, m = grid.length, n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    f++;
                }
            }
        }
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()&&f>0){
            int s = q.size();
            min++;
            for(int k=0;k<s;k++){
                int[] c = q.poll();
                for(int[] d:dir){
                    int x = c[0]+d[0], y = c[1]+d[1];
                    if(x>=0 && y>=0 && x<m && y<n && grid[x][y] == 1){
                        grid[x][y]=2;
                        f--;
                        q.offer(new int[]{x,y});
                    }
                }
            }
        }
        return f==0?min:-1;
    }
}