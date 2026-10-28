class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        int arr[]=nums.clone();
        Arrays.sort(arr);
        for(int i=0;i<nums.length;i++){
            if(arr[i]==target) list.add(i);
        }
        return list;
    }
}