class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);

        int d=0;
        int m=0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                d=nums[i];
            }
        }

        for(int i=0;i<=nums.length;i++){
            if(Arrays.binarySearch(nums,i)<0){
                m=i;
            }
        }
        return new int[]{d,m};
    }
}