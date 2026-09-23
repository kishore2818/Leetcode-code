class Solution {
    public int minOperations(int[] nums, int x) {
        int tot=0;
        for(int i:nums){
            tot+=i;
        }
        int tar=tot-x;
        if(tar<0) return -1;
        int sum=0;
        int left=0;
        int max=-1;

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];

            while(sum>tar){
                sum-=nums[left];
                left++;
            }
            if(tar==sum) max=Math.max(max,right-left+1);
        }
        if(max==-1) return -1;

        return nums.length-max;
    }
}