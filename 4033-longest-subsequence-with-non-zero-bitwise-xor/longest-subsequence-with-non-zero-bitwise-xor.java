class Solution {
    public int longestSubsequence(int[] nums) {
        int x = nums[0], n = nums.length;
        for(int i=1;i<n;i++){
            x^=nums[i];
        }
        if(x!=0){
            return n;
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                return n-1;
            }
        }
        return 0;
    }
}