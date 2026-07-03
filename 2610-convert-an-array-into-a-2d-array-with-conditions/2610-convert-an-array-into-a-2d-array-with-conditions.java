class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            int row=map.getOrDefault(i,0);
            if(row==list.size()){
                list.add(new ArrayList<>());
            }
            list.get(row).add(i);
            map.put(i,row+1);
        }
        return list;
    }
}