class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int p = 0, n = profit.length, m = worker.length;
        for(int i=0;i<m;i++){
            int max = 0;
            for(int j=0;j<n;j++){
                if(worker[i]>=difficulty[j]){
                    max = Math.max(max, profit[j]);
                }
            }
            p+=max;
        }
        return p;
    }
}