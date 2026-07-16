class Solution {
    public int largestAltitude(int[] gain) {
        int x = 0, a[] = new int[gain.length+1],max = 0;
        a[0] = 0;
        for(int i=0;i<gain.length;i++){
            x+=gain[i];
            a[i+1]=x;
            max = Math.max(max, a[i+1]);
        }
        return max;
    }
}