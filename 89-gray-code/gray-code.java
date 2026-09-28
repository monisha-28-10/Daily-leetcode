class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> r = new ArrayList<>();
        int t = 1 << n;
        for(int i=0; i< t;i++){
            int g = i ^ (i >> 1);
            r.add(g);
        }
        return r;
    }
}