class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,l=0,c=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                c++;
            }
            while(c>1){
                if(nums[l]==0){
                    c--;
                }
                l++;
            }
            max = Math.max(max,r-l);
        }
        return max;
    }
}