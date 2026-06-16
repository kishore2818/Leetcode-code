class Solution {
    public int getLeastFrequentDigit(int n) {
        int fre[]=new int[10];
        while(n!=0){
            int rev=n%10;
            fre[rev]++;
            n/=10;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<10;i++){
            if(fre[i]>0){
            ans=Math.min(fre[i],ans);
        }
        }
        for(int i=0;i<10;i++){
            if(fre[i]==ans) {
                return i;
            }
        }
        return 0;
    }
}