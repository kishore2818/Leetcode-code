class Solution {
    Boolean dp[][];
    public boolean canPartition(int[] nums) {
        int add=0;
        for(int i:nums){
            add+=i;
        } 
        if(add%2==1){
            return false;
        }
        dp = new Boolean[nums.length][add / 2 + 1];

        return check(nums,0,add/2);
    }
    public boolean check(int []nums,int index,int target){
        if(target==0){
            return true;
        }
        if(target<0 || index>=nums.length){
            return false;
        }
         if(dp[index][target] != null) {
            return dp[index][target];
        }

        return dp[index][target] =
               check(nums, index + 1, target - nums[index]) ||
               check(nums, index + 1, target);
    }
}