class Solution {
    public boolean canSortArray(int[] nums) {
        int arr[]=nums.clone();
        Arrays.sort(arr);
        int i=0;
        while(i<nums.length){
            int a=Integer.bitCount(nums[i]);
            int j=i;
            while(j<nums.length && Integer.bitCount(nums[j])==a){
                j++;
            }
            int seg[]=Arrays.copyOfRange(nums,i,j);
            Arrays.sort(seg);
            for(int k=i;k<j;k++){
                if(seg[k-i]!=arr[k]) 
                return false;
            }
            i=j;
        }
        return true;
    }
}