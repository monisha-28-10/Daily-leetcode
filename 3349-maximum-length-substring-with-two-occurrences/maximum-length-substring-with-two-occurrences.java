class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0,max=0,f[] = new int[26];
        for(int r=0;r<s.length();r++){
            f[s.charAt(r)-'a']++;
            while(f[s.charAt(r)-'a']>2){
                f[s.charAt(l)-'a']--;
                l++;
            }
            max= Math.max(max,r-l+1);
        }
        return max;
    }
}