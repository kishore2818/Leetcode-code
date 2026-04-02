class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int temp[]=nums.clone();
        int n=(nums.length-1)/2;
        int m=nums.length-1;
        for(int i=0;i<nums.length;i++){
           if(i%2==0){
            nums[i]=temp[n--];
           }else{
            nums[i]=temp[m--];
           }
        }     
    }
}