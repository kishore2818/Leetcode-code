class Solution {
    public int jump(int[] nums) {
        
        int j=0;
        int end=0;
        int fa=0;

        for(int i=0;i<nums.length-1;i++){
            fa=Math.max(fa,i+nums[i]);

            if(i==end){
                j++;
                end=fa;
            }
        }
        return j;
    }
}