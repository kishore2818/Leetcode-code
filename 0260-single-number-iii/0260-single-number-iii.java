class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int i=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1) {
                arr[i]=e.getKey();
                i++;
            }
        }
        return arr;
    }
}