class Solution {
    public boolean uniformArray(int[] nums1) {
        int m = Integer.MAX_VALUE, e = Integer.MAX_VALUE;
        for(int i:nums1){
            m = Math.min(m, i);
        }
        Arrays.sort(nums1);
        for(int i=1;i<nums1.length;i++){
            if((nums1[i]%2==1)&&(m%2==0)){
                if((nums1[i]-m)%2==1){
                    return false;
                }
            }else if(nums1[i]%2==0 && m%2==1){
                if((nums1[i]-m)%2==0){
                    return false;
                }
            }
        }
        return true;
    }
}