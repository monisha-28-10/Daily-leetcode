class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        sub(nums, 0, r, a);
        return r;
    }
    private void sub(int[] n, int i, List<List<Integer>> r, List<Integer> a){
        if(n.length == i){
            r.add(new ArrayList<>(a));
            return;
        }
        a.add(n[i]);
        sub(n, i+1, r, a);
        a.remove(a.size() - 1);
        sub(n, i+1, r, a);
    }
}