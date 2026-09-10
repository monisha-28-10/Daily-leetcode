class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0, st = -1, m = 0;
        while(i<s.length()){
            if(j<p.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')){
                i++;
                j++;
            }else if(j<p.length() && p.charAt(j)=='*'){
                st = j;
                m = i;
                j++;
            }else if(st!=-1){
                m++;
                i = m;
                j = st+1;
            }else{
                return false;
            }
        }
        while(j<p.length()&&p.charAt(j)=='*'){
            j++;
        }
        return j==p.length();
    }
}