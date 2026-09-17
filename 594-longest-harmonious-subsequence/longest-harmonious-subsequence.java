class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int n:nums){
            m.put(n, m.getOrDefault(n,0)+1);
        }
        int x = 0;
        for(int k:m.keySet()){
            if(m.containsKey(k+1)){
                x = Math.max(x, m.get(k)+m.get(k+1));
            }
        }
        return x;
    }
}