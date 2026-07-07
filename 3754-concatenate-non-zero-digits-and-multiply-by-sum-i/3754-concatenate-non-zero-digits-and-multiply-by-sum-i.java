class Solution {
    public long sumAndMultiply(int n) {
        Long ans=1L;
        StringBuilder sb=new StringBuilder();
        int m=0;
        while(n!=0){
            int r=n%10; 
            m+=r;
            if(r!=0) sb.append(r);
            n/=10;
        }
        if(sb.length()!=0) ans=Long.parseLong(sb.reverse().toString());
        return ans*m;
    }
}