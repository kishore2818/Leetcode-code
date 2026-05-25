class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            int m=-1;
            int n=-1;
            for(int j:map.keySet()){
                if(map.get(j)>m){
                m=map.get(j);
                n=j;
            }
        }
        ans[i]=n;
        map.put(n,-1);
        }
        return ans;

    }
}