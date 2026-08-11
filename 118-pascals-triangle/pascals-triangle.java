class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> b = new ArrayList<>();
            int v=1;
            for(int j=1;j<=i;j++){
                b.add(v);
                v = v*(i-j)/j;
            }
            a.add(b);
        }
        return a;
    }
}