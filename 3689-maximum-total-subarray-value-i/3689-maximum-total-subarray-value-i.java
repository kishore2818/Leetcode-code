class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int ma=nums[0];
        int mi=nums[0];
        
        for(int x:nums){
            ma=Math.max(x,ma);
            mi=Math.min(x,mi);
        }
        long dif=(long)(ma-mi);
        return  k*dif;
    }
}