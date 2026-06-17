class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int arr[]=new int[nums.length];
        int min=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(nums[i],min);
            arr[i]=min;
        }
        System.out.print(Arrays.toString(arr));
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            int d=max-arr[i];
            if(d<=k){
                return i;
            }
        }
        return -1;
    }
}