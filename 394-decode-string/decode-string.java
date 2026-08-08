class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();
        String cur = "";
        int n=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                n = n*10 + (c - '0');
            }else if(c=='['){
                num.push(n);
                str.push(cur);
                n=0;
                cur="";
            }else if(c==']'){
                int r=num.pop();
                String p = str.pop(), temp="";
                for(int i=0;i<r;i++){
                    temp += cur;
                }
                cur = p + temp;
            }else{
                cur+=c;
            }
        }
        return cur;
    }
}