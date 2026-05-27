class Solution {
    public int edgeScore(int[] edges) {
        long freq[]=new long[edges.length];
        for(int i=0;i<edges.length;i++){
            freq[edges[i]]+=i;
        }
        long high=0;
        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>high){
                high=freq[i];
                ans=i;
            }
        } 
        return ans;
    }
}