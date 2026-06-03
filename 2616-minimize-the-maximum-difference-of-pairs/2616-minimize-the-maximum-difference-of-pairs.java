class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int low=0;
        int high=nums[nums.length-1]-nums[0];
        while(low<high){
            int mid=low+(high-low)/2;
            int count=0;
        for(int i=0;i<nums.length-1;){
            if(nums[i+1]-nums[i]<=mid){
                count++;
                i+=2;
            }
            else{
                i++;
            }

        }

        if(count>=p){
            high=mid;
        }else{
            low=mid+1;
        }}

        return low;
    }
}