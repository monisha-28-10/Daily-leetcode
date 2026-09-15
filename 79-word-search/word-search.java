class Solution {
    public boolean exist(char[][] board, String word) {
        int x = 0,m = board.length, n = board[0].length;
        boolean v[][] = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(search(board,i,j,x,m,n,word, v)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean search(char[][] b,int i, int j, int x, int m, int n, String word, boolean[][] v){
        if(i<0 || j<0 || i>=m || j>=n || v[i][j] || b[i][j]!=word.charAt(x)){
            return false;
        }
        if(x == word.length()-1){
            return true;
        }
        v[i][j] = true;
        boolean f = search(b,i-1,j,x+1,m,n,word,v) || search(b,i+1,j,x+1,m,n,word,v) || search(b,i,j-1,x+1,m,n,word,v) || search(b,
        i,j+1,x+1,m,n,word,v);
        v[i][j] = false;
        return f;
    }
}