class Solution {
    public int hIndex(int[] cit) {
        Arrays.sort(cit);
        int count=0;
        for(int i=0;i<cit.length;i++){
            if(cit[i]>=cit.length-i) return cit.length-i;
            }
        return 0;
    }
}