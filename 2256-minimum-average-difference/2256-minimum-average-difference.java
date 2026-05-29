class Solution {
    public int minimumAverageDifference(int[] nums) {
        long left=0;long right=0;
        int ans=0;

        for(int i=0;i<nums.length;i++){
            right+=nums[i];
        }
        int la=0;
        long avg=0;
        long minavg=Long.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            left+=nums[i];
            right-=nums[i];
            la++;
            int ra=nums.length-1-i;
            long leftavg=left/la;
            long rightavg=0;
            if(ra!=0){
            rightavg=right/ra;
            }
            avg=Math.abs(leftavg-rightavg);
            if(avg<minavg){
                minavg=avg;
                ans=i;
            }
            
        }
        return ans;
    }
}