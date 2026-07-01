class Solution {
    public int firstMissingPositive(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 ){
                list.add(nums[i]);
            }}
            if(list.size()==0) return 1;
            Collections.sort(list);
            
            int ans=1;
            for(int i:list){
                if(i==ans) ans++;
                else if(i<ans) continue;
                else return ans;
            }
            return ans;
    }
} 