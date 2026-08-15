class Solution {
    public int firstMissingPositive(int[] nums) {
        int x = 1;
        HashSet<Integer> h = new HashSet<>();
        for(int n:nums){
            if(n>0){
                h.add(n);
            }
        }
        while(h.contains(x)){
            x++;
        }
        return x;
    }
}