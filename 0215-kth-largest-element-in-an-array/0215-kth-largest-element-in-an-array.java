class Solution {
    public int findKthLargest(int[] nums, int k) {
        // ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]!=nums[i+1]){
        //     list.add(nums[i]);
        //     }
        // }
        // list.add(nums[nums.length-1]);
        // int n=-k;
        return nums[nums.length-k];
    }
}