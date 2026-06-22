class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int i:map.values()){
        
            if(i==1) return -1;
            int temp=i;
            while(temp>0){
            if(temp%3==0) temp-=3;
            else temp-=2;
            count++;
            }}
            return count;
    }
}