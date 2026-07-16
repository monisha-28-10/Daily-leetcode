class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int idx=0,x=0,y=0;
        for(int i=0;i<gas.length;i++){
            int d=gas[i]-cost[i];
            x+=d;
            y+=d;
            if(y<0){
                idx=i+1;
                y=0;
            }
        }
        return x>=0? idx:-1;
    }
}