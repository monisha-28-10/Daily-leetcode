class Solution {
    public int equalPairs(int[][] grid) {
        List<List<Integer>> row = new ArrayList<>(), col = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> r = new ArrayList<>(), c = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                r.add(grid[i][j]);
                c.add(grid[j][i]);
            }
            row.add(r);
            col.add(c);
        }
        int count = 0;
        for(List<Integer> rw:row){
            for(List<Integer> cl:col){
                if(rw.equals(cl)){
                    count++;
                }
            }
        }
        return count;
    }
}