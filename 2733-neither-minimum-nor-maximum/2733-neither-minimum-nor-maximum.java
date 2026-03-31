class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n>2) return nums[1];
        // return 
        // for(int i=0;i<n;i++){
            
        // }
        return -1;
    }
}