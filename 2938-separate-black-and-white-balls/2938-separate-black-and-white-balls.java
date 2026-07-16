class Solution {
    public long minimumSteps(String s) {
        long count= 0;
        int z=0;
        for(int i=s.length()-1 ;i>=0;i--){
            if(s.charAt(i)=='0') z++ ;
            else count+=z;
        }
        return count;
    }
}