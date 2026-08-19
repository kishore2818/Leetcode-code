class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> ent:map.entrySet()){
            if(ent.getValue()==2) {
                list.add(ent.getKey());
            }
        }
        for(int i=0;i<list.size();i++){
            ans=list.get(i)^ans;
        }
        return ans;
    }
}