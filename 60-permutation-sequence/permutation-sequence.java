class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder s = new StringBuilder();
        List<Integer> a = new ArrayList<>();
        for(int i=1;i<=n;i++){
            a.add(i);
        }
        int m=1;
        for(int i=1;i<n;i++){
            m*=i;
        }
        k--;
        while(n>0){
            int idx = k/m;
            s.append(a.get(idx));
            a.remove(idx);
            k%=m;
            n--;
            if(n>0){
                m/=n;
            }
        }
        return s.toString();   
    }
}