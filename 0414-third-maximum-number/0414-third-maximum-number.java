class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1])
            {
                list.add(nums[i]);
            }
        }
        list.add(nums[nums.length-1]);

        if(list.size()>=3) return list.get(list.size()-3);
        else return list.get(list.size()-1);

    }
}