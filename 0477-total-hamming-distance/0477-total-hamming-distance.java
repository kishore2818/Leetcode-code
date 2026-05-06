class Solution {
    public int totalHammingDistance(int[] nums) {
        int count=0;
        for(int i=0;i<32;i++){
            int xor=0;
            for(int j:nums){
            if(((j>>i) & 1)==1) xor++;
            }
            count+=xor*(nums.length-xor);
        }
        return count;
    }
}