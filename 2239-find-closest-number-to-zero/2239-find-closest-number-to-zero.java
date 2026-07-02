class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(ans)) ans=nums[i];
            else if(Math.abs(ans)==Math.abs(nums[i])) {
                if(ans<nums[i]) ans=nums[i];
            } 
        }
        return ans;
    }
}