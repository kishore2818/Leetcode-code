class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
    int ans =0,a=x;
    while(x!=0){
        int rev=x%10;
        ans+=rev;
        x/=10;
    }
    if(a%ans==0) return ans;
    return -1;
    }
}