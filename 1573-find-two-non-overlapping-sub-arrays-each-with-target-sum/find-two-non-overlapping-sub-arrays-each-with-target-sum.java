class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length, sum =0, res = n+1, l = 0 , dp[] = new int[n+1];
        Arrays.fill(dp, n);
        for(int r=0;r<n;r++){
            sum+=arr[r];
            while(sum>target){
                sum-=arr[l++];
            }
            dp[r+1] = dp[r];
            if(sum == target){
                res = Math.min(res, r-l+1+dp[l]);
                dp[r+1] = Math.min(dp[r],r-l+1);
            }
        }
        return res == n+1?-1:res;
    }
}