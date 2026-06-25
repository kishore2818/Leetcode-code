class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i:nums){
            int a=i;
            if(map.get(i)>1) continue;
            int l=a-1;
            int r=a+1;

            if(!map.containsKey(l) && !map.containsKey(r)){
                ans.add(a);
            }
        }
        return ans;
    }
}