class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int a:arr){
            m.put(a,m.getOrDefault(a,0)+1);
        }
        HashSet<Integer> x = new HashSet<>();
        for(int f:m.values()){
            if(x.contains(f)){
                return false;
            }
            x.add(f);
        }
        return true;
    }
}