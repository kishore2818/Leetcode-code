class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> ent:map.entrySet()){
            if(ent.getValue()==1) ans= ent.getKey();
        }
        return ans;
    }
}