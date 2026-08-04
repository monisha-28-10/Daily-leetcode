class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        } 
        Arrays.sort(nums);
        int x=0;
        while(min<=max){
            if(nums[x]==min){
                x++;
            }else{
                a.add(min);
            }
            min++;
        }
        return a;
    }
}