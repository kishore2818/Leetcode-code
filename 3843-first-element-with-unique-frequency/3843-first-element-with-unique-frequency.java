class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> fre=new HashMap<>();
        for(int i:nums){
            fre.put(i,fre.getOrDefault(i,0)+1);
        }
        HashMap<Integer,Integer> fcount=new HashMap<>();
        for(int i:fre.values()){
            fcount.put(i,fcount.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int i:nums){
            if(fcount.get(fre.get(i))==1) return i;
        }
        return -1;
    }
}