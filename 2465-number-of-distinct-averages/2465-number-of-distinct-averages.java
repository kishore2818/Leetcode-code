class Solution {
    public int distinctAverages(int[] nums) {
        double ans=0;
        Arrays.sort(nums);
        HashSet<Double> list=new HashSet<>();
        int left=0;
        int right=nums.length-1;
        
        while(left<right){
            ans=(nums[left]+nums[right])/2.0;
            list.add(ans);
            left++;
            right--;
        }
        return list.size();
    }
}