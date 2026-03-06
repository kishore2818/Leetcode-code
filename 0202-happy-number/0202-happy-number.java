class Solution {
    public boolean isHappy(int n) {
        while(n>1){
            int ans=0;
        while(n!=0){
            int s=n%10;
            ans+=(s*s);
            n/=10;
        }
        if(ans==1)return true;
        if(ans==4) return false;
        n=ans;    
    }
    return true;
}
}