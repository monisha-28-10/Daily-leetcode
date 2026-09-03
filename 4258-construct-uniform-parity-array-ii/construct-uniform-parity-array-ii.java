class Solution {
    public boolean uniformArray(int[] nums1) {
        int m = Integer.MAX_VALUE, e = Integer.MAX_VALUE;
        for(int i:nums1){
            m = Math.min(m, i);
        }
        
        for(int n:nums1){
            if(n%2 != m%2){
                if((n-m)%2 != m%2){
                    return false;
                }
            }
        }
        return true;
    }
}