class Solution {
    public List<Integer> intersection(int[][] nums) {
        int []freq=new int[1001];
        for(int []row:nums){
            for(int num:row){
            freq[num]++;
        }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<1001;i++){
            if(freq[i]==nums.length){
                ans.add(i);
            }
        }
        return ans;
    }
}