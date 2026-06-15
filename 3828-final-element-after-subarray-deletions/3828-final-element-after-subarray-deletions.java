class Solution {
    public int finalElement(int[] nums) {
        // Arrays.sort(nums);
        // int a=0;
        // int b=nums.length-1;
        // int n=nums.length;
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i:nums){
        //     list.add(i);
        // }
        // while(n!=1){
        //     list.remove(a);
        //     n--;
        //     list.remove(b);
        //     n--;
        //     a++;
        //     b--;
        // }
        int ans=Math.max(nums[0],nums[nums.length-1]);
        return ans;
    }
}