class Solution {
    public long sumDigitDifferences(int[] nums) {
        long count=0;
        int dig=String.valueOf(nums[0]).length();
        for(int i=0;i<dig;i++){
            int fre[]=new int[10];
            for(int j=0;j<nums.length;j++){
                int d=nums[j]%10;
                count+=j-fre[d];
                fre[d]++;
                nums[j]/=10;
            }
        }
        return count;
    }
}