class Solution {
    public boolean vowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public int maxVowels(String s, int k) {
        int m=0,i=0,c=0;
        for(int j=0;j<s.length();j++){
            if (vowel(s.charAt(j))) {
                c++;
            }
            if(j-i+1==k){
                m = Math.max(c,m);
                if(vowel(s.charAt(i))){
                    c--;
                }
                i++;
            }
        }
        return m;
    }
}