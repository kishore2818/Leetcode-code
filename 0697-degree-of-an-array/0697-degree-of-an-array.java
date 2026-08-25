class Solution {
    public int findShortestSubArray(int[] nums) {
        int min=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> first=new HashMap<>();
        HashMap<Integer,Integer> last=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];

            map.put(n,map.getOrDefault(n,0)+1);

            if(!first.containsKey(n)){
                first.put(n,i);
            }
            last.put(n,i);

        }
        int deg=0;
        for(int i:map.keySet()){
            deg=Math.max(deg,map.get(i));
        }

        int ans=nums.length;

        for(int i:map.keySet()){
            if(map.get(i)==deg){
                int len=last.get(i)-first.get(i)+1;
                ans=Math.min(ans,len);
            }
        }
        return ans;
    }
}