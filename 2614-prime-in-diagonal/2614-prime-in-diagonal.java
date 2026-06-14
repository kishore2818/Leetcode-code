class Solution {
    public int diagonalPrime(int[][] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i][i])){
                ans=Math.max(ans,nums[i][i]);
            }
            if(isPrime(nums[i][n-1-i])){
                ans=Math.max(ans,nums[i][n-1-i]);
            }
        }
        return ans;
    }
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}