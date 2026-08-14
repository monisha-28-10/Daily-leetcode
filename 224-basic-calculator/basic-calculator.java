class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int r = 0,n = 0,sn = 1;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                n=n*10+(c-'0');
            }else if(c=='+'||c=='-'){
                r+=sn*n;
                n=0;
                sn=(c=='+')?1:-1;
            }else if(c=='('){
                st.push(r);
                st.push(sn);
                r=0;
                sn=1;
            }else if(c==')'){
                r+=sn*n;
                n=0;
                int ps=st.pop(),pr=st.pop();
                r=pr+ps*r;
            }
        }
        return r+sn*n;
    }
}