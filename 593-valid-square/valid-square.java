class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int a[][] = {p1,p2,p3,p4},x=0, b[] = new int[6];
        for(int i=0;i<a.length;i++){
            int x1=a[i][0], y1=a[i][1];
            for(int j=i+1;j<a.length;j++){
                int x2=a[j][0], y2=a[j][1];
                int d=((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2));
                b[x++]=d;
            }
        }
        Arrays.sort(b);
        if(b[0]==b[1]&&b[1]==b[2]&&b[2]==b[3]&&b[4]==b[5]&&b[5]==2*b[0]&&b[0]!=0){
            return true;
        }
        return false;
    }
}