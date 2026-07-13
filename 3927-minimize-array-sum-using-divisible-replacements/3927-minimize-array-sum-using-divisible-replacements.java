class Solution {
    public long minArraySum(int[] nums) {
    //     int tot=0;
    //     for(int i=0;i<nums.length;i++){
    //        int a=nums[i];
    //         for(int j=0;j<nums.length;j++){
    //         if(nums[i]%nums[j]==0){
    //             a=Math.min(a,nums[j]);
    //         }}
    //         tot+=a;
    //     }
        
    //         return tot;

        HashSet<Integer> set =new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        long tot=0;

        for(int i:nums){
            int min=i;
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    if(set.contains(j)){
                        min=Math.min(min,j);
                    }
                    if(set.contains(i/j)){
                        min=Math.min(min,i/j);
                    }
                }
            }
            tot+=min;
        }
        return tot;
    }
}