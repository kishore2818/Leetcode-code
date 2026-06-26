class Solution {
    public boolean isPrime(int n){
    for(int j=2;j*j<=n;j++){
        if(n%j==0){
           return false;
        }}
        return true;
    }
    public int distinctPrimeFactors(int[] nums) {
        int count=0;
        boolean isPrime=false;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            for(int j=2;j<=i;j++)
            {
                if(i%j==0) set.add(j);}

        }
        for(int i:set){
                if(isPrime(i)) count++;
            
            }
        return count;
    }
}