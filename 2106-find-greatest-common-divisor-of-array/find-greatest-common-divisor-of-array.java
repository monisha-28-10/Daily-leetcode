class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int n:nums){
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        int x = Math.min(max, min), y = 0;
        for(int i=1;i<=x;i++){
            if(max%i==0 && min%i==0){
                y=i;
            }
        }
        return y;
    }
}