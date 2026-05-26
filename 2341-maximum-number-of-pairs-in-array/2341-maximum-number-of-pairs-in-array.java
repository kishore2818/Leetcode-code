class Solution {
    public int[] numberOfPairs(int[] nums) {
        int arr[]=new int[101];
        for(int i:nums){
            arr[i]++;
        }
        int pair=0;
        int left=0;
    for(int i:arr){
        pair+=i/2;
        left+=i%2;
    }
    return new int []{pair,left};
    }
}