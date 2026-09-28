class Solution {
    public int[][] generateMatrix(int n) {
        int x = 0 , y = 0, dx = 1, dy = 0, r[][] = new int[n][n];
        for(int i=0;i<n*n;i++){
            r[y][x] = i+1;
            if(!(0<=x+dx && x+dx<n && 0<=y+dy && y+dy<n && r[y+dy][x+dx]==0)){
                int temp = dx;
                dx = -dy;
                dy = temp;
            }
            x+=dx;
            y+=dy;
        } 
        return r;
    }
}