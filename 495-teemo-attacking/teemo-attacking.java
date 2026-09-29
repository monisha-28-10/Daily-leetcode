class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int t = 0;
        for(int i = 1;i<timeSeries.length;i++){
            t+=Math.min(duration, timeSeries[i]-timeSeries[i-1]);
        }
        t+=duration;
        return t;
    }
}