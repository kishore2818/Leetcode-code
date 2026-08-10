class Solution {
    public int minimumDeletions(int[] nums) {
        int minid=0;
        int maxid=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[minid]){
                minid=i;
            }
            if(nums[i]>nums[maxid]){
                maxid=i;
            }
        }

        int left=Math.min(minid,maxid);
        int right=Math.max(minid,maxid);

        int o1=right+1;

        int o2=nums.length-left;

        int o3=(left+1)+(nums.length-right);
        
        return Math.min(o1,Math.min(o3,o2));

    }
}