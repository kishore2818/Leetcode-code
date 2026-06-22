class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]) return i;
        }
        return 0;
    }
}