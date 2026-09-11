class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length,n = matrix[0].length, l=0, r = m*n-1;
        while(l<=r){
            int mid = l+(r-l)/2, mv = matrix[mid/n][mid%n];
            if(mv<target){
                l = mid+1;
            }else if(mv>target){
                r = mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}