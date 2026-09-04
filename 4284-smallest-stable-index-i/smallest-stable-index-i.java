class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for(int j=0;j<=i;j++){
                max = Math.max(max, nums[j]);
            }
            for(int j=i;j<nums.length;j++){
                min = Math.min(min, nums[j]);
            }
            x = max-min;
            if(x<=k){
                return i;
            }
        }
        return -1;
    }
}