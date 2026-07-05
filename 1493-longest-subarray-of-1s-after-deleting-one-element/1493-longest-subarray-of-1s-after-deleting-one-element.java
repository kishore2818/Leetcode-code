class Solution {
    public int longestSubarray(int[] nums) {
        // int len=0;
        // int left=0;
        // int right=0;
        // for(int i=0;i<nums.length;i++){

        //     if(nums[i]==0){
                
        //     }
        //     if(nums[i]==1){
        //       len=Math.max(len,right-left+1);
        //         right++;
        //     }
        //     else {
        //         left=right;
        //     }
        // }
        // return len;

        int zero=0;
        int len=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0) zero++;

            while(zero>1){
                if(nums[left]==0) zero--;
                left++;
            }
            len=Math.max(len,right-left);
        }
        return len;
    }
}