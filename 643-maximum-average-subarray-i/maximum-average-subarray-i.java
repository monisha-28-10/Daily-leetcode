class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int x=0;
        for(int i=0;i<k;i++){
            x+=nums[i];
        }
        int max = x;
        for(int i=k;i<nums.length;i++){
            x+=nums[i];
            x-=nums[i-k];
            max = Math.max(max,x);
        }
        return (double) max/k;
    }
}