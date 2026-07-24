class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;

        while(i>=0 &&nums[i]>=nums[i+1]) i--;
        if(i>=0){

            int j=nums.length-1;
            while(nums[j]<=nums[i]) j--;

            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
       reverse(nums,i+1);

    }
    public void  reverse(int arr[],int start){
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}