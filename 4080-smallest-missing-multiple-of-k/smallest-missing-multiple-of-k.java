class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> h = new HashSet<>();
        for(int n:nums){
            h.add(n);
        }
        int x = k;
        while(h.contains(x)){
            x+=k;
        }
        return x;
    }
}