class Solution {
    public int removeDuplicates(int[] nums) {
        
        // int k=0;
        // for(int i:nums){
        //     if(k<2 || i!=nums[k-2]){
        //         nums[k]=i;
        //     k++;
        // }
        // }
        // return k;

        int left=2;
        for(int right=2;right<nums.length;right++){
            if(nums[right]!=nums[left-2]){
                nums[left]=nums[right];
                left++;
            }
        }
        return left;
    }
}