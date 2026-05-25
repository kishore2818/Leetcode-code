class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(i%2==0){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        }
        int min=0;
        int ans=-1;

        for(int i:map.keySet()){
            int fre=map.get(i);
            if(min<fre){
                min=fre;
                ans=i;
            }
            else if(min==fre && i<ans){
                ans=i;
            }
        }
        return ans;
    }
}