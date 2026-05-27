class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        
        list1.add(0,nums[0]);
        list2.add(0,nums[1]);
        int n=nums.length-2;
        int a=2;
        while(n!=0){
            if(list1.get(list1.size()-1)>list2.get(list2.size()-1)){
                list1.add(nums[a]);
            }else{
                list2.add(nums[a]);
            }
            a++;
            n--;
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<list1.size();i++){
        ans[i]=list1.get(i);
        }
        for(int i=0;i<list2.size();i++){
            ans[list1.size()+i]=list2.get(i);
        }
        return ans;
    }
}