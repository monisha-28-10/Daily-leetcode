class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] u = new boolean[nums.length];
        perm(nums,u,curr,res);
        return res;
        
    }
    private void perm(int[] nums, boolean[] u, List<Integer> curr, List<List<Integer>> res){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
        }
        for(int i=0;i<nums.length;i++){
            if(u[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !u[i-1]){
                continue;
            }
            curr.add(nums[i]);
            u[i]=true;
            perm(nums,u,curr,res);
            u[i]=false;
            curr.remove(curr.size()-1);
        }
    }
}