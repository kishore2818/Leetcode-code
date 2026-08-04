class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list =new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);

        }
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}