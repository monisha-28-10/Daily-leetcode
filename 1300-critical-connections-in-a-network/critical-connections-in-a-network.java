class Solution {
    int t =0,d[] ,l[];
    List<List<Integer>> adj, ans;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        d = new int[n]; l = new int[n];
        adj = new ArrayList<>();
        ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(List<Integer> e:connections){
            int u = e.get(0),v = e.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        Arrays.fill(d,-1);
        for(int i=0;i<n;i++){
            if(d[i]==-1){
                dfs(i,-1);
            }
        }
        return ans;
    }
    private void dfs(int c, int p){
        d[c] = t; 
        l[c] = t;
        t++;
        for(int nx:adj.get(c)){
            if(nx==p){
                continue;
            }else if (d[nx]==-1){
                dfs(nx,c);
                l[c] = Math.min(l[c], l[nx]);
                if(l[nx]>d[c]){
                    ans.add(Arrays.asList(c, nx));
                }
            }else{
                l[c] = Math.min(l[c],d[nx]);
            }
        }
    }
}