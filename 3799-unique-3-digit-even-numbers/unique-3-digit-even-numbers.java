class Solution {
    public int totalNumbers(int[] digits) {
        int c = 0, f[] = new int[10];
        for(int d:digits){
            f[d]++;
        }
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=8;k+=2){
                    if(f[i]==0){
                        continue;
                    }
                    f[i]--;
                    if(f[j]==0){
                        f[i]++;
                        continue;
                    }
                    f[j]--;
                    if(f[k]>0){
                        c++;
                    }
                    f[j]++;
                    f[i]++;
                }
            }
        }
        return c;
    }
}