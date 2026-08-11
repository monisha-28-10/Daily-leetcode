class Solution {
    public int maxPoints(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0],b[0]));
        int x=0,y=1,mv=0;
        double s=0;
        for(int i=0;i<points.length;i++){
            Map<Double, Integer> m = new HashMap<>();
            int x1 = points[i][x], y1 = points[i][y];
            for(int j=i+1;j<points.length;j++){
                int x2 = points[j][x], y2 = points[j][y];
                if(x1 == x2){
                    s = Double.POSITIVE_INFINITY;
                }else{
                    s = (double)(y2 - y1)/(x2 - x1);
                }
                m.put(s,m.getOrDefault(s,0)+1);
            }
            for(Map.Entry<Double, Integer> z:m.entrySet()){
                if(z.getValue()>mv){
                    mv = z.getValue();
                }
            }
        }
        return mv+1;
    }
}