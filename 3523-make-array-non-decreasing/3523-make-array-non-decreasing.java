class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=m) {
                count++;
                m=nums[i];
            }
        }
        return count;
    }
}