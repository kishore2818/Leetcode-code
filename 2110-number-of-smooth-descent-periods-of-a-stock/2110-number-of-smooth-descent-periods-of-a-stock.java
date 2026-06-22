class Solution {
    public long getDescentPeriods(int[] p) {
        long len=1;
        long ans=1;

        for(int i=1;i<p.length;i++){
            if(p[i-1]-p[i]==1) len++;
            else len=1;
            ans+=len;
        }
        return ans;
    }
}