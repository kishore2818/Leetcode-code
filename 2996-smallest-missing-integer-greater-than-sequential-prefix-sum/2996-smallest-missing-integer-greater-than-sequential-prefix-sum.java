class Solution {
    public int missingInteger(int[] nums) {
      int sum=nums[0];
      HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<nums.length-1;i++){
        if(nums[i]+1==nums[i+1]){
            sum+=nums[i+1];
      }
      else{
        break;
      }}
      for(int i:nums){
        set.add(i);
      }
        while(set.contains(sum)) {sum++;}
      
      System.out.print(set);
      return sum;
    }
}