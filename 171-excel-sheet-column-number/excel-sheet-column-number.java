class Solution {
    public int titleToNumber(String columnTitle) {
        int x = 0;
        for(char c:columnTitle.toCharArray()){
            x = x*26+(c-'A'+1);
        }
        return x;
    }
}