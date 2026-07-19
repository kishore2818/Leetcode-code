class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int b=i+1;
            if(n%b==0){
            int a=nums[i]*nums[i];
            sum+=a;
        }
        }
        return sum;
    }
}