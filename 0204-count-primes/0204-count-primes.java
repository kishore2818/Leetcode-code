class Solution {
    // public boolean isprime(int a){
    //     if(a<=1) return false;
    //     for(int i=2;(long)i*i<=a;i++){
    //         if(a%i==0) return false;
    //     }
    //     return true;
    // }
    public int countPrimes(int n) {
        boolean prime[]=new boolean[n];
        Arrays.fill(prime,true);
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
            for(int j=i*i;j<n;j+=i){
                prime[j]=false;
            }
        }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(prime[i]){
                count++;
            }
        }
        return count;
    }


}