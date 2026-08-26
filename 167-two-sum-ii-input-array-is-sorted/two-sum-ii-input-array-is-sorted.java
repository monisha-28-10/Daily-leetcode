class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0, r = numbers.length-1, a[] = new int[2];
        a[0]=-1; a[1]=-1;
        while(l<r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                a[0] = l+1; a[1] = r+1;
                return a;
            }else if(sum<target){
                l++;
            }else{
                r--;
            }
        }
        return a;
    }
}