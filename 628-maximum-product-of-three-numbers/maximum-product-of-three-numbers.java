class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int x1 = nums[0]*nums[1]*nums[n-1], x2 = nums[n-3]*nums[n-2]*nums[n-1];
        
        return Math.max(x1, x2);
    }
}