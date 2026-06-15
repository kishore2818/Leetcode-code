class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int num=n;

        while(n!=0){
            int rem=n%10;
            sum+=rem;
            pro*=rem;
            n/=10;
        }
        int ans=sum+pro;
        if(num%ans==0) return true;
        return false;
    }
}