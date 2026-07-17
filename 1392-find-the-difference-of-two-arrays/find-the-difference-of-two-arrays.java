class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>(), n2 = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());
        for(int i:nums1){
            n1.add(i);
        }
        for(int i:nums2){
            n2.add(i);
        }
        for(int j:n1){
            if(!n2.contains(j)){
                res.get(0).add(j);
            }
        }
        for(int j:n2){
            if(!n1.contains(j)){
                res.get(1).add(j);
            }
        }
        return res;
    }
}