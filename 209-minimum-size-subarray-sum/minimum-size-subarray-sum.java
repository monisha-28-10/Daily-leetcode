class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, sum = 0, m = Integer.MAX_VALUE;
        for(int r = 0;r< nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                if(r-l+1 < m){
                    m = r-l+1;
                }
                sum -=nums[l];
                l++;
            }
        }
        return m!=Integer.MAX_VALUE ? m : 0;
    }
}