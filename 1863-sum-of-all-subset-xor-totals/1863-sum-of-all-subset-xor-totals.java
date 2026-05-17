class Solution {
    public int subsetXORSum(int[] nums) {
    //     int tot =0;
    //     for(int i=0;i<nums.length;i++){
    //         int xor=0;
    //         for(int j=0;j<nums.length;j++){
    //             if(i!=j){
    //              xor=nums[i]^nums[j];
    //         }
    //         }
    //         tot+=xor;
    //     }
    //     // for(int i:nums){
    //     //     tot+=i;
    //     // }
    //     return tot;
    return find(nums,0,0);
    }

    public int find(int nums[],int index,int xor){
        if(index==nums.length){
            return xor;
        }
        int take=find(nums,index+1,xor^nums[index]);

        int skip=find(nums,index+1,xor);

        return take+skip;
    }
}