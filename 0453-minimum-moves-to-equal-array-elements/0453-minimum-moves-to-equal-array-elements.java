class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            count+=nums[i]-min;
        }
        return count;
    }
}