class Solution {
    public int findKthNumber(int m, int n, int k) {
        int l = 1,h = m*n;
        while(l<h){
            int mid = l+(h-l)/2,c = 0;
            for(int i=1;i<=m;i++){
                c+=Math.min(mid/i,n);
            }
            if(c<k){
                l=mid+1;
            }else{
                h=mid;
            }
        }
        return l;
    }
}