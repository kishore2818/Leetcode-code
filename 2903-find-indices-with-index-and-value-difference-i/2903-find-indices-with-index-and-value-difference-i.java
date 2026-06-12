class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                a=Math.abs(i-j);
                b=Math.abs(nums[i]-nums[j]);
                if(a>=indexDifference && b>=valueDifference) {
                    return new int[]{i,j};
            }
        }
        }
        return new int[]{-1,-1};
    }
}