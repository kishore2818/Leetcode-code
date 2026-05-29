class Solution {
    public int findMiddleIndex(int[] nums) {
        int left=0;
        int right=0;
        for(int i:nums){
            right+=i;
        }
        
        for(int i=0;i<nums.length;i++){
            left+=nums[i];
            if(left==right) return i;
            right-=nums[i];
        }
        return -1;
    }
}