class Solution {
    public long countCommas(long n) {
        long x = 1000, c = 0;
        while(x<=n){
            c+=n-x+1;
            x*=1000;
        }
        return c;
    }
}