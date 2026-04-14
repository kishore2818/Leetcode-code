class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                while(!isPrime(nums[i])){
                    nums[i]++;
                    count++;
                }
            }
            else{
                while(isPrime(nums[i])){
                    nums[i]++;
                    count++;
            }
            }     
        }
        return count;
    }
    public boolean isPrime(int num){
        if(num<=1) return false;

        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}