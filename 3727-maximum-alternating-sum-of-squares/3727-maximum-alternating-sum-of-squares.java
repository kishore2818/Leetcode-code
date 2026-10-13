class Solution {
    public long maxAlternatingSum(int[] nums) {
        
        int n=nums.length;
        int []sq=new int[n];
        for(int i=0;i<n;i++){
            sq[i]=nums[i]*nums[i];
        }
        long ans=0;
        int mid=n/2;
        Arrays.sort(sq);
        for(int i=0;i<mid;i++){
            ans-=sq[i];
        }
        for(int i=mid;i<n;i++){
            ans+=sq[i];
        }
        return ans;
    }
}